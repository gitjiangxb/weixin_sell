package com.imooc.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.dataObject.ProductInfo;

/**
 * @Package:com.imooc.dao
 * @ClassName:ProductInfoRepositoryTest
 * @Description:TODO 商品类 Dao的测试类
 * @author:Jiangxb
 * @date:2018年10月17日 下午6:46:37
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
	
	@Autowired
	private ProductInfoRepository productInfoRepository;
	
	@Test
	public void saveTest() {
		// 写一个新增的测试方法
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId("12315");
		productInfo.setProductName("养生小米粥");
		productInfo.setProductPrice(new BigDecimal(5.2));
		productInfo.setProductStock(100);
		productInfo.setProductDescription("小米熬的非常稠！");
		productInfo.setProductIcon("http://xxxxx.jpg");
		productInfo.setProductStatus(0);
		productInfo.setCategoryType(3);
		
		ProductInfo result = productInfoRepository.save(productInfo);
		Assert.assertNotNull(result);
		
	}
	
	@Test
	public void findByProductStatus() {
		// 测试查询上架的商品
		List<ProductInfo> productInfos = productInfoRepository.findByProductStatus(0);
		Assert.assertNotEquals(0, productInfos.size());
	}
}
