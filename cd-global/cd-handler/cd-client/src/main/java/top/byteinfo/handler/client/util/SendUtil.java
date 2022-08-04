package top.byteinfo.handler.client.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConnectionFactory;
import top.byteinfo.handler.client.bo.SendMessage;

import static com.rabbitmq.client.MessageProperties.MINIMAL_BASIC;

public class SendUtil {
    public static void send() {
        ObjectMapper objectMapper = new ObjectMapper();


        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("192.168.1.11");
            factory.setPort(5672);
            Channel channel = factory.newConnection().createChannel();
            channel.basicPublish("HANDLER_EXCHANGE", "*", MINIMAL_BASIC, objectMapper.writeValueAsBytes(new SendMessage("消息1")));
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("...");


        System.out.println();
    }
}
