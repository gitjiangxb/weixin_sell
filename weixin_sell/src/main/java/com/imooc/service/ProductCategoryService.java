package com.imooc.service;

import java.util.List;

import com.imooc.dataObject.ProductCategory;

/**
 * @Package:com.imooc.service
 * @ClassName:ProductCategoryService
 * @Description:TODO 类目 服务层
 * @author:Jiangxb
 * @date:2018年10月9日 下午7:17:13
 * 
 */
public interface ProductCategoryService {
	
	ProductCategory findById(Integer categoryId);
	
	List<ProductCategory> findAll();

	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
	
	//	更新 与 新增
	ProductCategory save(ProductCategory productCategory);
}
