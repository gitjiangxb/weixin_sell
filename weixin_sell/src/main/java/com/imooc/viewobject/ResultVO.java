package com.imooc.viewobject;

import lombok.Getter;
import lombok.Setter;

/**
 * @Package:com.imooc.viewobject
 * @ClassName:ResultVO
 * @Description:TODO HTTP请求返回的最外层格式
 * @author:Jiangxb
 * @date:2018年10月30日 上午11:19:44
 * 
 */
@Getter
@Setter
public class ResultVO<T> {
	
	/**
	 * @Fields:code : TODO 状态码
	 */
	private Integer code;
	
	/**
	 * @Fields:msg : TODO 提示信息
	 */
	private String msg;
	
	/**
	 * @Fields:data : TODO 返回的具体内容(泛型)
	 */
	private T data;
}
