package com.py.KafkaProducer.controller;


import com.py.KafkaProducer.kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SendMessageController {


    @Autowired
    Producer producer;

    @GetMapping("/send")
    public String sendMessage(String message) {
        System.out.println(message);
        producer.sendHighPriorityMessage(message);
        return "ok";
    }
}
