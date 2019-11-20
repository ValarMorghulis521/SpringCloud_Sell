package com.imooc.apigetway.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.imooc.apigetway.exception.RateLimitException;
import com.netflix.zuul.ZuulFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SERVLET_DETECTION_FILTER_ORDER;

/**
 * 限流
 */
@Component
public class RateLimitFilter extends ZuulFilter {
    //guava组件对令牌桶的实现
    private static final RateLimiter  RATE_LIMITER =RateLimiter.create(100);
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return SERVLET_DETECTION_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        //尝试去取一个令牌
        if(!RATE_LIMITER.tryAcquire()){
            throw new RateLimitException();
        }
        return null;
    }
}
