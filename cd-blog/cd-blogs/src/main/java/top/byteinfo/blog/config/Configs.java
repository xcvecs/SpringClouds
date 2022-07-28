package top.byteinfo.blog.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Configs {


    @Data
    public static class OssConfig {
        private Integer nums;
        private String url;
        private String bucketName;
    }

    @Bean
    @ConfigurationProperties(prefix = "int.string")
    OssConfig getOssConfig() {
        return new OssConfig();
    }
}
