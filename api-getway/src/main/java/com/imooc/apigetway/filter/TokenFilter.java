package com.imooc.apigetway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.mockito.internal.util.StringUtil;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

@Component
public class TokenFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return PRE_TYPE;
    }
    /**
     * filterOrder 是过滤器的顺序，越小的优先级越高
     * @return
     */
    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 实现逻辑
     * @return
     */
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        //从url参数获取，也可以从cookie,header里获取
        String tocken = request.getParameter("token");
        if(StringUtils.isEmpty(tocken)){
//            requestContext.setSendZuulResponse(false);
//            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        return null;
    }
}
