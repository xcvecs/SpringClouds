package com.example.cdboot.core;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Logging {

    @Component
    @Data
    class User{
       private String name="1111";
    }

    private User user;

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }


}
