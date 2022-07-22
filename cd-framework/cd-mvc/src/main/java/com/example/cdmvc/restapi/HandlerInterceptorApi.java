package com.example.cdmvc.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandlerInterceptorApi {
    @GetMapping("/")
    ResponseEntity<?> local() {
        return ResponseEntity.ok("get home");
    }

    @GetMapping("/handler")
    ResponseEntity<?> get() {
        return ResponseEntity.ok("ok");
    }
}
