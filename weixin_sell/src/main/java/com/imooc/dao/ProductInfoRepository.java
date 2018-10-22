package com.imooc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imooc.dataObject.ProductInfo;

/**
 * @Package:com.imooc.dao
 * @ClassName:ProductInfoRepository
 * @Description:TODO 商品表实体 Dao
 * @author:Jiangxb
 * @date:2018年10月17日 下午6:38:11
 * 
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{
	
	/**
	 * @Title:findByProductStatus
	 * @Description:TODO 查询所有上架的商品
	 * @param productStatus
	 * @return:List<ProductInfo>
	 * @author:Jiangxb
	 * @date: 2018年10月17日 下午6:43:01
	 */
	List<ProductInfo> findByProductStatus(Integer productStatus);
	
}
