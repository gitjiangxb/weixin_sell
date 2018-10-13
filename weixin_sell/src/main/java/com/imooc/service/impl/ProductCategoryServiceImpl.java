package com.imooc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.dao.ProductCategoryRepository;
import com.imooc.dataObject.ProductCategory;
import com.imooc.service.ProductCategoryService;

/**
 * @Package:com.imooc.service.impl
 * @ClassName:ProductCategoryServiceImpl
 * @Description:TODO 类目 服务层接口实现类
 * @author:Jiangxb
 * @date:2018年10月13日 上午10:15:03
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryRepository repository;
	
	@Override
	public ProductCategory findById(Integer categoryId) {
		Optional<ProductCategory> productCategory = repository.findById(categoryId);
		// 值不为空
		if(productCategory.isPresent()) {
			return productCategory.get();
		}else {
			return null;
		}
		
	}
	
	@Override
	public List<ProductCategory> findAll() {
		return repository.findAll();
	}

	@Override
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
		return repository.findByCategoryTypeIn(categoryTypeList);
	}

	@Override
	public ProductCategory save(ProductCategory productCategory) {
		return repository.save(productCategory);
	}

}
