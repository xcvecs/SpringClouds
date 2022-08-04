package top.byteinfo.cdblogmq.amqp.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConnectionFactory;
import lombok.SneakyThrows;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import top.byteinfo.cdblogmq.amqp.bo.SendMessage;

import static com.rabbitmq.client.MessageProperties.MINIMAL_BASIC;
import static top.byteinfo.cdblogmq.amqp.config.RabbitmqConfig.HANDLER_EXCHANGE;

@Component
public class HandlerProducer {

    static ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    RabbitTemplate rabbitTemplate;

    //    @Scheduled(fixedDelay = 1000)
    public void task() {
        try {
            rabbitTemplate.convertAndSend(HANDLER_EXCHANGE, "*", new Message(objectMapper.writeValueAsBytes(new SendMessage("消息")), new MessageProperties()));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }

    private ConnectionFactory factory;
    private Channel channel;


    @SneakyThrows
    @Scheduled(fixedDelay = 1000)
    public void scheduled() {

        if (factory == null) {
            this.factory = new ConnectionFactory();
            factory.setHost("192.168.1.11");
            factory.setPort(5672);
        }

        if (channel == null) {
            channel = factory.newConnection().createChannel();
        }


        System.out.println("...");
        channel.basicPublish(HANDLER_EXCHANGE, "*", MINIMAL_BASIC, objectMapper.writeValueAsBytes(new SendMessage("消息")));
    }
}
