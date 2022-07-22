package com.example.cdintegration.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * for blog {@autowired collection}
 */
@Configuration
public class CustomConfiguration {
    BeanDefinition beanDefinition;

//    @Autowired
//    SearchService searchService;




   public interface SearchService {

        void Search();
    }

//    @Component
    class MysqlSearchService implements SearchService {

        @Override
        public void Search() {
            System.out.println("MysqlSearchService");
        }
    }

    @Component
    class EsSearchService implements SearchService {

        @Override
        public void Search() {
            System.out.println("EsSearchService");
        }
    }


    @Bean
    MysqlSearchService getMysqlSearchService() {
        return new MysqlSearchService();
    }
//
//    @Bean
//    EsSearchService getEsSearchService() {
//        return new EsSearchService();
//    }


}
