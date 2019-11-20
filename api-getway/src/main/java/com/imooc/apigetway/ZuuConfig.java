package com.imooc.apigetway;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

/**
 * 实现修改配置文件不需要重启
 */
public class ZuuConfig {
    @ConfigurationProperties("zuul")
    @RefreshScope
    public ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }
}
