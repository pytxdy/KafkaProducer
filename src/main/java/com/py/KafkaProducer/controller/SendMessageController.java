package com.py.KafkaProducer.controller;


import com.py.KafkaProducer.kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {


    @Autowired
    Producer producer;

    @PostMapping("/send")
    public String sendMessage(String message) {
        producer.sendHighPriorityMessage(message);
        return "ok";
    }
}
