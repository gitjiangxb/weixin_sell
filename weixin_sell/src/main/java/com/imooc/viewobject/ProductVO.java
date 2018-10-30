package com.imooc.viewobject;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * @Package:com.imooc.viewobject
 * @ClassName:ProductVO
 * @Description:TODO 商品(包含类目)信息的返回格式
 * @author:Jiangxb
 * @date:2018年10月30日 下午2:14:59
 * 
 */
@Getter
@Setter
public class ProductVO {
	
	/**
	 * @Fields:categoryName : TODO 类目名称
	 */
	@JsonProperty("name") // 返回前台时，显示name
	private String categoryName;
	
	/**
	 * @Fields:categoryType : TODO 类目类型
	 */
	@JsonProperty("type")
	private Integer categoryType;
	
	/**
	 * @Fields:productInfoVOList : TODO 商品详情
	 */
	@JsonProperty("foods")
	private List<ProductInfoVO> productInfoVOList;
}
