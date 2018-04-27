package com.cherish.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SSOFilter implements Filter {

    public static Logger logger = LoggerFactory.getLogger(SSOFilter.class);

    private String SSO_SERVER_URL;

    @Override
    public void init(FilterConfig filterConfig) {
        SSO_SERVER_URL = filterConfig.getInitParameter("SSO_SERVER_URL");
        if (SSO_SERVER_URL == null) {
            logger.error("SSO_SERVER_URL IS NULL.");
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        //获取请求和响应
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        //获取全局会话
        HttpSession session = httpServletRequest.getSession();
        //获取全局会话中的User
        String user = (String) session.getAttribute("User");
        //验证是否登陆
        //如果已登录,则进入该应用程序;
        //如果未登录重定向至SSO-Server登陆;
        if (!StringUtils.isEmpty(user)) {
            chain.doFilter(httpServletRequest, httpServletResponse);
            return;
        } else {
            String callBackUrl = httpServletRequest.getRequestURL().toString();
            StringBuilder url = new StringBuilder();
            url.append(SSO_SERVER_URL).append("?callBackUrl=").append(callBackUrl);
            httpServletResponse.sendRedirect(url.toString());
        }
    }

    @Override
    public void destroy() {

    }

}
