package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {

	private Logger logger = LoggerFactory.getLogger(Listener.class);

	@Autowired
	private EntityRepository entityRepository;
	
	@JmsListener(destination = "${jms.queue01}")
	public void receiveText(String text) {
		logger.info("Received text: " + text);
	}
	
	@JmsListener(destination = "${jms.queue02}", containerFactory = "myFactory")
	public void receiveObject(EntityDTO object) {
		logger.info("Received object: " + object);
		entityRepository.save(object);
	}

}
