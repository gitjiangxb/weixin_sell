package com.imooc.service;

import com.imooc.dataObject.ProductCategory;

/**
 * @Package:com.imooc.service
 * @ClassName:ProductCategoryService
 * @Description:TODO 栏目 服务层
 * @author:Jiangxb
 * @date:2018年10月9日 下午7:17:13
 * 
 */
public interface ProductCategoryService {
	
	ProductCategory findOne(Integer categoryId);
}
