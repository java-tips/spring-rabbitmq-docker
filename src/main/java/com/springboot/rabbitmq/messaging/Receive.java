package com.springboot.rabbitmq.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
 
@Component
public class Receive {
 
    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload String message) {
      System.out.println("Receive a new Message: " + message);
    }
}