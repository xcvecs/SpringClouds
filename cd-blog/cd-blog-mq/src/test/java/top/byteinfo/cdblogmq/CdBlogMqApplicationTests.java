package top.byteinfo.cdblogmq;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootTest
class CdBlogMqApplicationTests {

    @Test
    void contextLoads() {
    }

  static   class RabbitmqProducer{
        private static String exchangeName;
        private static AMQP.BasicProperties props;
        private Channel channel;

        public RabbitmqProducer(Channel channel) {

            try {
                ConnectionFactory factory = new ConnectionFactory();

                this.channel = factory.newConnection().createChannel();


            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (TimeoutException e) {
                throw new RuntimeException(e);
            }




        }
        public void send( ) throws IOException {

            String value =" r.toJSON(outputConfig)";
            String routingKey = "getRoutingKeyFromTemplate(r)";

            channel.basicPublish(exchangeName, routingKey, props, value.getBytes());

        }
    }

}
