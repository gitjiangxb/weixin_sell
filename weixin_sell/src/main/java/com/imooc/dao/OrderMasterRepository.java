package com.imooc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.imooc.dataObject.OrderMaster;

/**
 * @Package:com.imooc.dao
 * @ClassName:OrderMasterRepository
 * @Description:TODO 订单主表 Dao
 * @author:Jiangxb
 * @date:2018年10月22日 上午10:33:50
 * 
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
	// https://blog.csdn.net/wncnke/article/details/54408394
//	List<OrderMaster> findSearch(OrderMaster order);
}
