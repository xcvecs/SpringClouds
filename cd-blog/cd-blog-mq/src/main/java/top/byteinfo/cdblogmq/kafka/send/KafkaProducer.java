package top.byteinfo.cdblogmq.kafka.send;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducer {

    private KafkaTemplate kafkaTemplate;

    @Autowired
    public void setKafkaTemplate(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topicName, String jsonMessage) {
        kafkaTemplate.send(topicName, jsonMessage);
    }

}
