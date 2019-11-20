package com.imooc.apigetway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

/**
 * 跨域配置
 * C-Cross O-Origin R-Resource S-Sharing
 */
@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter(){
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        //是否支持cookie跨域
        config.setAllowCredentials(true);
        //原始域 http:a.com
        config.setAllowedOrigins(Arrays.asList("*"));
        config.setAllowedHeaders(Arrays.asList("*"));
        config.setAllowedMethods(Arrays.asList("*"));
        config.setMaxAge(300l);
        //把跨域的配置注册到source上
        source.registerCorsConfiguration("*",config);
        return new CorsFilter(source);
    }
}
