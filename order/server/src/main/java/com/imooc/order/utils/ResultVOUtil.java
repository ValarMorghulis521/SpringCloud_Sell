package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;

/**
 * Created by sun
 * 2018-12-10 18:03
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
