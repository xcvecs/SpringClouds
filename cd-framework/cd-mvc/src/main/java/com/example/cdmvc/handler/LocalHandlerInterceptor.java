package com.example.cdmvc.handler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
@Configuration
public class LocalHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod){
            System.out.println("get handler");
        }

        if (handler instanceof Method){
            System.out.println();
        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
