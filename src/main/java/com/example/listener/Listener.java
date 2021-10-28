package com.example.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {

	private Logger logger = LoggerFactory.getLogger(Listener.class);
	
	@JmsListener(destination = "${jms.queue}")
	public void receiveMessage(String message) {
		logger.info("Received message: " + message);
	}
}
