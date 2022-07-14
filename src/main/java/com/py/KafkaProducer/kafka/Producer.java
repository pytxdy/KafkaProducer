package com.py.KafkaProducer.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {

    @Autowired
    public KafkaTemplate kafkaTemplate;

    public void sendHighPriorityMessage(String msg) {
        kafkaTemplate.send("test", 0, msg);
    }

    public void sendMediumPriorityMessage(String msg) {
        kafkaTemplate.send("test", 1, msg);
    }

    public void sendLowPriorityMessage(String msg) {
        kafkaTemplate.send("test", 2, msg);
    }
}
