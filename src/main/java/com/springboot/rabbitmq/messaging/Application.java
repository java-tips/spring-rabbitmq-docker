package com.springboot.rabbitmq.messaging;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class Application implements CommandLineRunner {

	private final SendMessage sendMessage;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	public Application(SendMessage sendMessage) {
		this.sendMessage = sendMessage;
	}

	@Override
	public void run(String... strings) {
		
		sendMessage.send("First message to Rabbitmq!!!");
		sendMessage.send("Second message to Rabbitmq!!!");

	}

}
