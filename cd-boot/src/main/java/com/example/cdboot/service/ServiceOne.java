package com.example.cdboot.service;

import com.example.cdboot.config.Configs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;


/**
 * @see org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor AutowiredMethodElement resolveMethodArguments
 *
 * MethodParameter methodParam = new MethodParameter(method, i);  Method method
 * DependencyDescriptor currDesc = new DependencyDescriptor(methodParam, this.required);
 * currDesc.setContainingClass(bean.getClass());
 */
@Service
public class ServiceOne {

    private Map<String, Configs> map;
    @Autowired
    public void setMap(  Map<String, Configs> map) {
        this.map = map;
    }

    public String s1() {

        System.out.println("=============");
        Collection<Configs> values = map.values();
        return "configs.getS1()";
    }


}
