package com.imooc.dataObject;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Getter;
import lombok.Setter;

/**
 * @Package:com.imooc.dataObject
 * @ClassName:ProductInfo
 * @Description:TODO 商品表实体
 * @author:Jiangxb
 * @date:2018年10月13日 上午11:31:41
 * 商品和类目的关系，用类目编号来关联
 */
@Entity
@DynamicUpdate
@Setter
@Getter
public class ProductInfo {
	/**
	 * @Fields:productId : TODO 主键,(商品id是按照自定义格式生成的字符)
	 */
	@Id
	private String productId;
	
	/**
	 * @Fields:productName : TODO 商品名称
	 */
	private String productName;
	
	/**
	 * @Fields:productPrice : TODO 单价
	 */
	private BigDecimal productPrice;
	
	/**
	 * @Fields:productStock : TODO 库存
	 */
	private Integer productStock;
	
	/**
	 * @Fields:productDescription : TODO 描述
	 */
	private String productDescription;
	
	/**
	 * @Fields:productIcon : TODO 商品图片
	 */
	private String productIcon;
	
	/**
	 * @Fields:productStatus : TODO 状态，0正常 1下架
	 */
	private Integer productStatus;
	
	/**
	 * @Fields:categoryType : TODO 类目编号
	 */
	private Integer categoryType;
}
