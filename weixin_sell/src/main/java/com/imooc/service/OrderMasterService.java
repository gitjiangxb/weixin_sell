package com.imooc.service;

import java.util.List;

import com.imooc.dataObject.OrderMaster;

/**
 * @Package:com.imooc.service
 * @ClassName:OrderMasterService
 * @Description:TODO 订单主表 服务层接口
 * @author:Jiangxb
 * @date:2018年10月30日 上午9:27:33
 * 
 */
public interface OrderMasterService {
	List<OrderMaster> findSearch(OrderMaster order);
}
