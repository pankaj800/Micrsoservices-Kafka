package com.sample.kafka.producer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class UserResource {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTeamplate;
	private final String TOPIC="pankaj-test-sample";
	
	@GetMapping("publish/{message}")
	public String postMessage(@PathVariable("message") String message ) {
		kafkaTeamplate.send(TOPIC, message);
		return "published successfully	";
	}

}
