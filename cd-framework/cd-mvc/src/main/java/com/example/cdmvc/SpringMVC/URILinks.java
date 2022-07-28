package com.example.cdmvc.SpringMVC;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

/**
 * URI Links
 *
 *
 * https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-uri-building
 */
public class URILinks {

    /**
     *
     * 1.5.1 UriComponents
     */
    UriComponents uriComponents = UriComponentsBuilder
            .fromUriString("https://example.com/hotels/{hotel}")
            .queryParam("q", "{q}")
            .encode()
            .build();

    URI uri = uriComponents.expand("Westin", "123").toUri();


    URI uri1 = UriComponentsBuilder
            .fromUriString("https://example.com/hotels/{hotel}")
            .queryParam("q", "{q}")
            .build("Westin", "123");

    URI uri2 = UriComponentsBuilder
            .fromUriString("https://example.com/hotels/{hotel}?q={q}")
            .build("Westin", "123");



    String baseUrl = "https://example.com";
    DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(baseUrl);
    URI uri3 = uriBuilderFactory.uriString("/hotels/{hotel}")
            .queryParam("q", "{q}")
            .build("Westin", "123");


    /**
     *
     * 1.5.4. Relative Servlet Requests
     */
    HttpServletRequest request = null;

// Re-uses scheme, host, port, path, and query string...

    URI uri4 = ServletUriComponentsBuilder.fromRequest(request)
            .replaceQueryParam("accountId", "{id}")
            .build("123");
}
