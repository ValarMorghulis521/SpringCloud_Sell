package com.imooc.product.enums;

import lombok.Data;
import lombok.Getter;

/**
 * 商品上下架状态
 */

@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWM(1,"下架"),
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
