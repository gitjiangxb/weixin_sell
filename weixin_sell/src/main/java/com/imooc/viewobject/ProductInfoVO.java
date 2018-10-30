package com.imooc.viewobject;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * @Package:com.imooc.viewobject
 * @ClassName:ProductInfoVO
 * @Description:TODO 商品详情(返回格式)
 * @author:Jiangxb
 * @date:2018年10月30日 下午2:24:00
 * 
 */
@Getter
@Setter
public class ProductInfoVO {
	
	/**
	 * @Fields:productId : TODO 商品id
	 */
	@JsonProperty("id")
	private String productId;
	
	/**
	 * @Fields:productName : TODO 商品名称
	 */
	@JsonProperty("name")
	private String productName;
	
	/**
	 * @Fields:productPrice : TODO 商品单价
	 */
	@JsonProperty("price")
	private BigDecimal productPrice;
	
	/**
	 * @Fields:productDescription : TODO 商品描述
	 */
	@JsonProperty("description")
	private String productDescription;
	
	/**
	 * @Fields:productIcon : TODO 商品图片
	 */
	@JsonProperty("icon")
	private String productIcon;
}
