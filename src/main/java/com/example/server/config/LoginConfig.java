package com.example.server.config;

import com.example.server.interceptor.UserLoginInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author baimuii
 */
public class LoginConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new UserLoginInterceptor());
        /**
         * 所有路径都被拦截
         * 添加不拦截路径
         * 登录路径
         * html静态资源
         * js静态资源
         * css静态资源
         */
        registration.addPathPatterns("/**");
        registration.excludePathPatterns(
                "/**/login",
                "/**/register",
                "/**/*.html",
                "/**/*.js",
                "/**/*.css"
        );
    }
}
