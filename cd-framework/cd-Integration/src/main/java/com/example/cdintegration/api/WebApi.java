package com.example.cdintegration.api;

import com.example.cdintegration.config.CustomConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashMap;

@RestController
public class WebApi {

    @Autowired
    LinkedHashMap<String, CustomConfiguration.SearchService> map;


    @GetMapping("")
    void t() {

        System.out.println("////");




    }
    @GetMapping("/t")
    void t1() {

        Collection<CustomConfiguration.SearchService> values = map.values();
        System.out.println();

    }

}
