package com.imooc.dao;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.dataObject.OrderMaster;


/**
 * @Package:com.imooc.dao
 * @ClassName:OrderMasterRepositoryTest
 * @Description:TODO 
 * @author:Jiangxb
 * @date:2018年10月22日 上午10:41:31
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired 
	private OrderMasterRepository orderMasterRepository;
	
	@Test
	public void findById() {
		Optional<OrderMaster> orderMaster = orderMasterRepository.findById("001");
		Assert.assertNotEquals(null, orderMaster.get());
		/*if(orderMaster.isPresent()) {
			logger.info("找到数据");
		}else {
			logger.info("未找到数据");
		}*/
	}
	
	@Test
	public void save() {
		OrderMaster order = new OrderMaster();
		order.setOrderId("001");
		order.setBuyerName("张三");
		order.setBuyerPhone("18396144436");
		order.setBuyerAddress("福建省厦门市湖里区");
		order.setBuyerOpenid("001");
		order.setOrderAmount(new BigDecimal("2000"));
		order.setOrderStatus(0);
		order.setPayStatus(0);
		
		OrderMaster orderSave = orderMasterRepository.save(order);
		Assert.assertNotEquals(null, orderSave);
	}
}
