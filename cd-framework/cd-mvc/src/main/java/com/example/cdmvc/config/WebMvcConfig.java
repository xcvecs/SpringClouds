package com.example.cdmvc.config;

import com.example.cdmvc.handler.LocalHandlerInterceptor;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;
import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.util.pattern.PathPatternParser;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;


/**
 *  <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-config-enable">...</a>
 *
 * @Configuration
 * @EnableWebMvc
 * public class WebConfig {
 * }
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    LocalHandlerInterceptor localHandlerInterceptor;

    /**
     * 1.11.3
     * Type Conversion 类型转换 
     * @param registry
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        DateTimeFormatterRegistrar registrar = new DateTimeFormatterRegistrar();
        registrar.setUseIsoFormat(true);

        registrar.registerFormatters(registry);

    }

    /**
     * 1.11.4
     * Validation 验证
     *
     * @return
     */
    @Override
    public Validator getValidator() {
        return WebMvcConfigurer.super.getValidator();
    }

    /**
     * 1.11.5
     * Interceptors
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localHandlerInterceptor);
    }

    /**
     * 1.11.6.
     * Content Types
     * @param configurer
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.mediaType("json", MediaType.APPLICATION_JSON);
        configurer.mediaType("xml", MediaType.APPLICATION_XML);

    }


    /**
     * 1.11.7 Message Converters
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder()
                .indentOutput(true)
                .dateFormat(new SimpleDateFormat("yyyy-MM-dd"))
                .modulesToInstall(new ParameterNamesModule());
        converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
        converters.add(new MappingJackson2XmlHttpMessageConverter(builder.createXmlMapper(true).build()));


        WebMvcConfigurer.super.configureMessageConverters(converters);
    }


    /**
     * 1.11.8. View Controllers
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");

        WebMvcConfigurer.super.addViewControllers(registry);
    }

    /**
     * 1.11.9. View Resolvers
     *
     * @param registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.enableContentNegotiation(new MappingJackson2JsonView());
        registry.jsp();

        WebMvcConfigurer.super.configureViewResolvers(registry);
    }

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.enableContentNegotiation(new MappingJackson2JsonView());
//        registry.freeMarker().cache(false);
//    }
//
//    @Bean
//    public FreeMarkerConfigurer freeMarkerConfigurer() {
//        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
//        configurer.setTemplateLoaderPath("/freemarker");
//        return configurer;
//    }


    /**
     * 1.11.10. Static Resources
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/public", "classpath:/static/")
                .setCacheControl(CacheControl.maxAge(Duration.ofDays(365)));

        WebMvcConfigurer.super.addResourceHandlers(registry);
    }


    /**
     * 1.11.11. Default Servlet
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();


        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
    }

    /**
     * 1.11.12. Path Matching
     *
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer
                .setPatternParser(new PathPatternParser())
                .addPathPrefix("/api", HandlerTypePredicate.forAnnotation(RestController.class));

        WebMvcConfigurer.super.configurePathMatch(configurer);
    }



}
