package com.imooc.dataObject;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Getter;
import lombok.Setter;

/**
 * @Package:com.imooc.dataObject
 * @ClassName:OrderMaster
 * @Description:TODO 订单主表
 * @author:Jiangxb
 * @date:2018年10月22日 上午10:17:49
 * 
 */
@Entity
@DynamicUpdate
@Getter
@Setter
public class OrderMaster {
	/**
	 * @Fields:orderId : TODO 订单编号
	 */
	@Id
	private String orderId;
	
	/**
	 * @Fields:buyerName : TODO 买家姓名
	 */
	private String buyerName;
	
	/**
	 * @Fields:buyerPhone : TODO 买家电话
	 */
	private String buyerPhone; 
	
	/**
	 * @Fields:buyerAddress : TODO 买家地址
	 */
	private String buyerAddress;
	
	/**
	 * @Fields:buyerOpenid : TODO 买家微信openid
	 */
	private String buyerOpenid;
	
	/**
	 * @Fields:orderAmount : TODO 订单总金额
	 */
	private BigDecimal	orderAmount;
	
	/**
	 * @Fields:orderStatus : TODO 订单状态(默认为新下单)
	 */
	private Integer orderStatus;
	
	/**
	 * @Fields:payStatus : TODO 支付状态(默认未支付)
	 */
	private Integer payStatus;
}
