package top.byteinfo.handler.client.core;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import lombok.SneakyThrows;

public class SendClient {
   static ConnectionFactory factory = new ConnectionFactory();

    @SneakyThrows
    public static void main(String[] args) {
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare("exchangeName","context.getConfig().rabbitmqExchangeType");
        channel.basicPublish("exchangeName", "routingKey", MessageProperties.MINIMAL_PERSISTENT_BASIC, "value".getBytes());
    }
}
