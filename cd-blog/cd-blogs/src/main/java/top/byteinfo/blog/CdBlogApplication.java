package top.byteinfo.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CdBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(CdBlogApplication.class, args);

    }

}
