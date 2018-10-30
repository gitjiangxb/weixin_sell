package com.imooc.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.dataObject.ProductInfo;

/**
 * @Package:com.imooc.service
 * @ClassName:ProductInfoServiceTest
 * @Description:TODO 商品表 服务层测试类
 * @author:Jiangxb
 * @date:2018年10月30日 上午9:33:38
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceTest {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ProductInfoService productInfoService;
	
	@Test
	public void findOne() throws Exception{
		ProductInfo result = productInfoService.findOne("12313");
		Assert.assertEquals("12313", result.getProductId());
	}
	
	@Test
	public void findUpAll() throws Exception{
		// 查询所有在架的商品
		List<ProductInfo> list = productInfoService.findUpAll();
		Assert.assertNotEquals(0, list.size());
	}
	
	@Test 
	public void findAll() throws Exception{
		// 分页查询所有信息
//		Sort sort = new Sort(Sort.Direction.DESC,"creat_time");
//		PageRequest pageRequest = new PageRequest(0, 2, sort);
		PageRequest pageRequest = new PageRequest(0, 2);
		Page<ProductInfo> productInfoPage = productInfoService.findAll(pageRequest);
		System.out.println(productInfoPage.getTotalElements());	// 总元素
	}
	
	@Test
	public void save() throws Exception{
		// 保存方法就不测试了
	}
}
