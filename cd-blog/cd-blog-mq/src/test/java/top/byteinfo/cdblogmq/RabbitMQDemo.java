package top.byteinfo.cdblogmq;

import com.rabbitmq.client.Address;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMQDemo {

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        Address address = new Address("localhost",1234);
        try (Connection connection = factory.newConnection()){
            Channel connectionChannel = connection.createChannel();


        } catch (IOException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}
