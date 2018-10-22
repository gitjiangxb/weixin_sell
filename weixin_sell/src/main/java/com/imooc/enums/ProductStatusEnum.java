package com.imooc.enums;

import lombok.Getter;

/**
 * @Package:com.imooc.enums
 * @ClassName:ProductStatusEnum
 * @Description:TODO 商品状态的枚举
 * @author:Jiangxb
 * @date:2018年10月17日 下午7:29:19
 * 
 */
@Getter
public enum ProductStatusEnum {
	UP(0,"上架"),
	DOWN(1,"下架")
	;
	private Integer code;
	
	private String message;

	private ProductStatusEnum(Integer code,String message) {
		this.code = code;
		this.message = message;
	}
	
}
