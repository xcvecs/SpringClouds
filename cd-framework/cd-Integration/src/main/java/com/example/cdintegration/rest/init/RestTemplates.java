package com.example.cdintegration.rest.init;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

public class RestTemplates {
    /**
     * The default constructor uses java.net.HttpURLConnection to perform requests.
     * You can switch to a different HTTP library with an implementation of ClientHttpRequestFactory.
     * There is built-in support for the following:
     */
    RestTemplate template = new RestTemplate(new HttpComponentsClientHttpRequestFactory());


    RestTemplate templateOkhttp = new RestTemplate(new OkHttp3ClientHttpRequestFactory());

    RestTemplate restTemplate = new RestTemplate();


    /**
     * some methods accept a URI template and URI template variables ,ether as a string variable argument or as map<String,String>
     */
    String result = restTemplate.getForObject(
            "https://example.com/hotels/{hotel}/bookings/{booking}", String.class, "42", "21");


    Map<String, String> vars = Collections.singletonMap("hotel", "42");

    String result1 = restTemplate.getForObject(
            "https://example.com/hotels/{hotel}/rooms/{hotel}", String.class, vars);


    /**
     * you can use the exchange method to specify request headers, as the following example shows
     */
    String uriTemplate = "https://example.com/hotels/{hotel}";
    URI uri = UriComponentsBuilder.fromUriString(uriTemplate).build(42);

    RequestEntity<Void> requestEntity = RequestEntity.get(uri)
            .header("MyRequestHeader", "MyValue")
            .build();

    ResponseEntity<String> response = template.exchange(requestEntity, String.class);

    String responseHeader = response.getHeaders().getFirst("MyResponseHeader");
    String body = response.getBody();







}
