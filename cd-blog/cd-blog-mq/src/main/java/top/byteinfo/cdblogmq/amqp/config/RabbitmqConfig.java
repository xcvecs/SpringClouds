package top.byteinfo.cdblogmq.amqp.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

    public final static String HANDLER_QUEUE = "HANDLER_QUEUE";//队列
    public final static String HANDLER_EXCHANGE = "HANDLER_QUEUE";//交换机

    @Bean
    public Queue handlerQueue() {
        return new Queue(HANDLER_QUEUE, true);
    }

    @Bean
    public FanoutExchange handlerExchange() {
        return new FanoutExchange(HANDLER_EXCHANGE, true, false);
    }

    @Bean
    public Binding bindingArticleDirect() {
        return BindingBuilder.bind(handlerQueue()).to(handlerExchange());
    }



}
