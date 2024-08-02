package com.crsc.sqs.consumer;

import org.springframework.stereotype.Component;

import io.awspring.cloud.sqs.annotation.SqsListener;

@Component
public class MyConsumer {

    @SqsListener("my-queue")
    public void listen(MyMessage message) {
        System.out.println("Message received: " + message.content()); 
    }
}
