package com.example.cdboot.api;

import com.example.cdboot.service.ServiceOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApi {
    BeanDefinition beanDefinition;
    @Autowired
    private ServiceOne serviceOne;

    @GetMapping
    public String t1() {
        serviceOne.s1();
        return "okokok";
    }
}
