package com.example.cdintegration;

import com.example.cdintegration.config.CustomConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;


@SpringBootApplication
public class CdIntegrationApplication {

    @Autowired
    Map<String, CustomConfiguration.SearchService> map;


    public static void main(String[] args) {
        SpringApplication.run(CdIntegrationApplication.class, args);
    }

}
