package top.byteinfo.cdservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import top.byteinfo.cdservice.util.Jackson;
import top.byteinfo.handler.client.api.bo.SendTaskModel;

@Component
@RabbitListener(queues = "EMAIL_QUEUE")
public class Consumer {

    @RabbitHandler
    public void consumer(byte[] data){

        SendTaskModel sendTaskModel = Jackson.convertValue(data, SendTaskModel.class);

    }
}
