package com.example.cdmvc.SpringMVC;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class Cors {

    /**
     * @CrossOrigin the @CorssOrigin annotation enables cross-orgin request on annotated controller menthods,
     * as the following example shows
     */
    @RestController
    @RequestMapping("/account")
    public class AccountController {

        /**
         * All origins.
         * <p>
         * All headers.
         * <p>
         * All HTTP methods to which the controller method is mapped.
         *
         * @param id
         * @return
         */
        @CrossOrigin
        @GetMapping("/{id}")
        public Account retrieve(@PathVariable Long id) {
            // ...
            return null;
        }

        @DeleteMapping("/{id}")
        public void remove(@PathVariable Long id) {
            // ...
        }
        class Account{

        }
    }


    /**
     * Global
     */
    @Configuration
    @EnableWebMvc
    public class WebConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {

            registry.addMapping("/api/**")
                    .allowedOrigins("https://domain2.com")
                    .allowedMethods("PUT", "DELETE")
                    .allowedHeaders("header1", "header2", "header3")
                    .exposedHeaders("header1", "header2")
                    .allowCredentials(true).maxAge(3600);

            // Add more mappings...
        }
    }

    /**
     * global
     * other impl
     */

    void config(){
        CorsConfiguration config = new CorsConfiguration();

// Possibly...
// config.applyPermitDefaultValues()

        config.setAllowCredentials(true);
        config.addAllowedOrigin("https://domain1.com");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",config);


        CorsFilter filter = new CorsFilter(source);
    }

}

