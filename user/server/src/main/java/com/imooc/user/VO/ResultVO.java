package com.imooc.user.VO;

import lombok.Data;

/**
 * Http请求返回的最外层对象
 * @param <T>
 */
@Data
public class ResultVO<T>{
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 具体内容
     */
    private T data;
}
