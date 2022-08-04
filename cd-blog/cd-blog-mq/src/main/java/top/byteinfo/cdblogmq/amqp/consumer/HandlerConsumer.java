package top.byteinfo.cdblogmq.amqp.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import top.byteinfo.cdblogmq.amqp.bo.SendMessage;

import java.io.IOException;

import static top.byteinfo.cdblogmq.amqp.config.RabbitmqConfig.HANDLER_QUEUE;
@Slf4j
@Component
@RabbitListener(queues = HANDLER_QUEUE)
public class HandlerConsumer {

    static ObjectMapper objectMapper = new ObjectMapper();
    @RabbitHandler
    public void process(byte[] data) throws IOException {
        String s = new String(data);

        log.info(s);
            SendMessage sendMessage = objectMapper.readValue(data, SendMessage.class);

            log.info(sendMessage.getMessage());


    }
}
