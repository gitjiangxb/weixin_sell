package com.imooc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.dataObject.ProductCategory;
import com.imooc.dataObject.ProductInfo;
import com.imooc.service.ProductCategoryService;
import com.imooc.service.ProductInfoService;
import com.imooc.utils.ResultVOUtil;
import com.imooc.viewobject.ProductInfoVO;
import com.imooc.viewobject.ProductVO;
import com.imooc.viewobject.ResultVO;

/**
 * @Package:com.imooc.controller
 * @ClassName:BuyerProductController
 * @Description:TODO 买家商品 相关的api
 * @author:Jiangxb
 * @date:2018年10月30日 上午11:12:57
 * 注意：这里返回的JSON格式需要提前定义
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
	
	@Autowired
	private ProductInfoService productInfoService;
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	/**
	 * @Title:list
	 * @Description:TODO 得到商品信息
	 * @return:ResultVO
	 * @author:Jiangxb
	 * @date: 2018年10月30日 下午3:29:12
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/list")
	public ResultVO list() {
		// 1、查询所有的上架商品
		List<ProductInfo> productInfoList = productInfoService.findUpAll();
		/**
		 * 2、查询类目(一次性查询)_根据上架商品得到categoryType(栏目类型)
		 * 	2.1 传统方法
		 */
//		List<Integer> categoryTypeList1 = new ArrayList<Integer>();
//		for(ProductInfo productInfo : productInfoList) {
//			categoryTypeList1.add(productInfo.getCategoryType());
//		}
		
		/**
		 * 2、查询类目(一次性查询)_根据上架商品得到categoryType(栏目类型)
		 * 	2.2 精简方法(JDK8,lambda表达式)
		 */
		List<Integer> categoryTypeList = productInfoList.stream()
				.map(e -> e.getCategoryType())
				.collect(Collectors.toList());
		
		List<ProductCategory> productCategoriesList = productCategoryService.findByCategoryTypeIn(categoryTypeList);
		// 3、数据拼装
		ProductVO productVO = null;
		ProductInfoVO productInfoVO = null;
		List<ProductVO> productVOList = new ArrayList<ProductVO>();
		List<ProductInfoVO> productInfoVOList = null;
		
		for(ProductCategory productCategory : productCategoriesList) {
			productVO = new ProductVO();
			productVO.setCategoryType(productCategory.getCategoryType());
			productVO.setCategoryName(productCategory.getCategoryName());
			// 遍历商品详情
			productInfoVOList = new ArrayList<ProductInfoVO>();
			for(ProductInfo productInfo : productInfoList) {
				if(productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
					productInfoVO = new ProductInfoVO();
//					productInfoVO.setProductId(productId);	// 属性单个单个写太麻烦了
					BeanUtils.copyProperties(productInfo, productInfoVO);	// 利用spring的拷贝(前提：字段名保持一致)
					productInfoVOList.add(productInfoVO);
				}
			}
			productVO.setProductInfoVOList(productInfoVOList);
			productVOList.add(productVO);
		}
		return ResultVOUtil.success(productVOList);
	}
}
