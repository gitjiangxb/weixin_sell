package com.imooc.utils;

import com.imooc.viewobject.ResultVO;

/**
 * @Package:com.imooc.utils
 * @ClassName:ResultVOUtil
 * @Description:TODO HTTP请求返回的工具类
 * @author:Jiangxb
 * @date:2018年10月30日 下午5:58:59
 * 
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class ResultVOUtil {
	
	/**
	 * @Title:success
	 * @Description:TODO 处理成功
	 * @param object	返回的数据
	 * @return:ResultVO
	 * @author:Jiangxb
	 * @date: 2018年10月30日 下午5:59:45
	 */
	public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    /**
     * @Title:success
     * @Description:TODO 处理成功
     * @return:ResultVO
     * @author:Jiangxb
     * @date: 2018年10月30日 下午6:05:13
     */
    public static ResultVO success() {
        return success(null);
    }

    /**
     * @Title:error
     * @Description:TODO 处理失败
     * @param code	状态码
     * @param msg	错误信息
     * @return:ResultVO
     * @author:Jiangxb
     * @date: 2018年10月30日 下午6:00:20
     */
    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
