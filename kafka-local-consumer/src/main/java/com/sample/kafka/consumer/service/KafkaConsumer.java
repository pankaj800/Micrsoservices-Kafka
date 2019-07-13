package com.sample.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	
	@KafkaListener(topics="pankaj-test-sample",groupId="group_id")
	public void consumeMessage(String message) {
		System.out.println("succssfully read message "+message);
	}
}
