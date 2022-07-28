package com.example.cdintegration.rest.body;

import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class RestTemplates {


    RestTemplate restTemplate = new RestTemplate();
    class Person {
        String user;
        String password;
    }
    Person person = new Person();
    URI location = restTemplate.postForLocation("https://example.com/people", person);
}
