package com.yukong.rabbitproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitProducerApplicationTests {

    @Autowired
    private RabbitProducer producer;

    @Test
    public void testStringSend() {
        for (int i = 0; i < 10; i++) {
            producer.stringSend();
        }
    }

    @Test
    public void testFanoutSend() {
        producer.fanoutSend();
    }

    @Test
    public void testTopic() {
        producer.topicTopic1Send();
        producer.topicTopic2Send();
        producer.topicTopic3Send();
    }

}
