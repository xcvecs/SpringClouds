package top.byteinfo.cdblogmq.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//@Profile("amqp")
@EnableScheduling
@SpringBootApplication
public class CdBlogAmqpApplication {
    public static void main(String[] args) {
        SpringApplication.run(CdBlogAmqpApplication.class,args);

    }
}
