package com.py.KafkaProducer.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class Producer {


    public static final String highPriorityTopic = "highTest";

    public static final String mediumPriorityTopic = "mediumTest";

    public static final String lowPriorityTopic = "lowTest";
    @Autowired
    public KafkaTemplate kafkaTemplate;

    public void sendHighPriorityMessage(String msg) {
        kafkaTemplate.send(highPriorityTopic, msg);
    }

    public void sendMediumPriorityMessage(String msg) {
        kafkaTemplate.send(mediumPriorityTopic, msg);
    }

    public void sendLowPriorityMessage(String msg) {
        kafkaTemplate.send(lowPriorityTopic, msg);
    }
}
