package com.example.jmssender.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(Product message) {
        LOGGER.info("sending message='{}'", message);  //convertAndSend converts the object to a JMS message before sending
        jmsTemplate.convertAndSend("temp", message);  //by default destination is queue

    }

}

    /*public void send(String message){
        LOGGER.info("sending message='{}'",message);  //convertAndSend converts the object to a JMS message before sending
        jmsTemplate.convertAndSend("helloworld", message);  //by default destination is queue

    } */