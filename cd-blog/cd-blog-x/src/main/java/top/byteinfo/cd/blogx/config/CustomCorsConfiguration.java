package top.byteinfo.cd.blogx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CustomCorsConfiguration {

    /**
     *
     * what happens
     *
     * @return
     */
    @Bean
    CorsFilter getCorsFilter() {
        //CorsConfiguration
        CorsConfiguration config = new CorsConfiguration();
        // configurer
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        // UrlBasedCorsConfigurationSource
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        // CorsFilter
        CorsFilter filter = new CorsFilter(source);
        return filter;
    }


}
