package com.imooc.service;


import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.dataObject.ProductCategory;



/**
 * @Package:com.imooc.service
 * @ClassName:ProductCategoryServiceTest
 * @Description:TODO 类目服务层 测试类
 * @author:Jiangxb
 * @date:2018年10月13日 上午10:29:38
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceTest {
	
	@Autowired
	private ProductCategoryService categoryService;
	
	@Test
	public void findById() throws Exception{
		ProductCategory productCategory = categoryService.findById(1);
		// 利用断言来判断是否成功；查出来的id为1，表示成功
		Assert.assertEquals(new Integer(1), productCategory.getCategoryId());;
	} 
	
	@Test
	public void findAll() throws Exception{
		List<ProductCategory> list = categoryService.findAll();
		Assert.assertNotEquals(0, list.size());
	} 
	
	@Test
	public void findByCategoryTypeIn() throws Exception{
		List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
	    Assert.assertNotEquals(0, productCategoryList.size());
	} 
	
	@Test
	public void save() throws Exception{
		 ProductCategory productCategory = new ProductCategory();
		 productCategory.setCategoryName("男生最爱");
		 productCategory.setCategoryType(3);
	     ProductCategory result = categoryService.save(productCategory);
	     Assert.assertNotNull(result);
	} 
	
}
