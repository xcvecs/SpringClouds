package top.byteinfo.cdblogmq.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Profile("amqp")
@SpringBootApplication
public class CdBlogAmqpApplication {
    public static void main(String[] args) {
        SpringApplication.run(CdBlogAmqpApplication.class,args);
    }
}
