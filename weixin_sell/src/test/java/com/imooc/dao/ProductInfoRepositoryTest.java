package com.imooc.dao;

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
		productInfo.setProductId("12313");
		
	}
	
	@Test
	public void findByProductStatus() {
		// 测试查询上架的商品
		List<ProductInfo> productInfos = productInfoRepository.findByProductStatus(0);
		Assert.assertNotEquals(0, productInfos.size());
	}
}
