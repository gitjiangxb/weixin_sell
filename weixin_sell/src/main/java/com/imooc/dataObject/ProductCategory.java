package com.imooc.dataObject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Package:com.imooc.dataObject
 * @ClassName:ProductCategory
 * @Description:TODO 类目表实体
 * @author:Jiangxb
 * @date:2018年10月9日 下午4:14:40
 * 
 */
// 指定表名(若表存在前缀时需要这样写，默认不需要；如imooc_product_category)
//@Table(name = "product_category")
@Entity
@DynamicUpdate	// 动态更新★
//@Data	// 尽量少使用全量的
@Setter
@Getter
public class ProductCategory {
	
	/**
	 * @Fields:categoryId : TODO 类目id
	 */
	@Id		// 主键
	@GeneratedValue(strategy = GenerationType.IDENTITY)		// 自增
	private Integer categoryId;
	
	/**
	 * @Fields:categoryName : TODO 类目名字
	 */
	private String categoryName;
	
	/**
	 * @Fields:categoryType : TODO 类目编号
	 */
	private Integer categoryType;
	
	/**
	 * @Fields:createTime : TODO 创建时间
	 */
	private Date createTime;
	
	/**
	 * @Fields:updateTime : TODO 更新时间
	 */
	private Date updateTime;

	@Override
	public String toString() {
		return "ProductCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryType="
				+ categoryType + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
}
