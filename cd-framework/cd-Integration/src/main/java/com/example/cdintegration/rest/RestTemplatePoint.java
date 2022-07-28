package com.example.cdintegration.rest;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class RestTemplatePoint {

    /**
     * The default constructor uses java.net.HttpURLConnection to perform requests.
     * You can switch to a different HTTP library with an implementation of ClientHttpRequestFactory.
     * There is built-in support for the following:
     *
     */
    RestTemplate template = new RestTemplate(new HttpComponentsClientHttpRequestFactory());


    RestTemplate templateOkhttp =new RestTemplate(new OkHttp3ClientHttpRequestFactory());






}
