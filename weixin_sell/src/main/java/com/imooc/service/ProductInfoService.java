package com.imooc.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.imooc.dataObject.ProductInfo;

/**
 * @Package:com.imooc.service
 * @ClassName:ProductInfoService
 * @Description:TODO 商品实体 服务类
 * @author:Jiangxb
 * @date:2018年10月17日 下午7:12:37
 * 
 */
public interface ProductInfoService {
	
	ProductInfo findById(String productId);
	
	/**
	 * @Title:findUpAll
	 * @Description:TODO 查询上架的商品
	 * @return:List<ProductInfo>
	 * @author:Jiangxb
	 * @date: 2018年10月17日 下午7:15:03
	 */
	List<ProductInfo> findUpAll();
	
	/**
	 * @Title:findAll
	 * @Description:TODO 管理端查询全部数据时，需要分页
	 * @param pageable	注意导入的包：import org.springframework.data.domain.Pageable
	 * @return:Page<ProductInfo>
	 * @author:Jiangxb
	 * @date: 2018年10月17日 下午7:17:42
	 */
	Page<ProductInfo> findAll(Pageable pageable);
	
	ProductInfo save(ProductInfo productInfo);
	
	// 加库存(取消订单)
	
	// 减库存(下订单)
	
}
