package com.example.cdmvc.SpringMVC;

import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RouterFunctions.route;

/**
 * a lightweight functional programming model
 *
 * https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#webmvc-fn
 *
 */
public class FunctionalEndpoints {


    public RouterFunction<ServerResponse> sse() {
        return route(GET("/sse"), request -> ServerResponse.sse(sseBuilder -> {
            // Save the sseBuilder object somewhere..
        }));
    }

}
