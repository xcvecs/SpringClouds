package top.byteinfo.blog.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedOriginPatterns("*")
                .allowedMethods("*");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                String currentPage = request.getParameter("CURRENT");
                String pageSize = Optional.ofNullable(request.getParameter("SIZE")).orElse("DEFAULT_SIZE");
//                if (!StringUtils.isNullOrEmpty(currentPage)) {
//                    PageUtils.setCurrentPage(new Page<>(Long.parseLong(currentPage), Long.parseLong(pageSize)));
//                }
                return true;
            }
        });
    }


}
