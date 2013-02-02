package com.rabbit;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

public class Producer {

	@Autowired
	private AmqpTemplate messageQueue;
	
	private final AtomicInteger counter = new AtomicInteger();

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/mq-producer-context.xml");
	}

	@Scheduled(fixedRate = 1000)
	public void execute() {
		System.out.println("execute...");
		messageQueue.convertAndSend("hello " + counter.incrementAndGet());
	}
}
