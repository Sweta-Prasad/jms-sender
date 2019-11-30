package com.example.jmssender.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

//@Configuration
public class SenderConfig {

  /*  @Value("${activemq.broker-url}")
    private String brokerUrl;

    @Bean
    public ActiveMQConnectionFactory senderActiveMQConnectionFactory(){
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL(brokerUrl);

        return activeMQConnectionFactory;
    }

    @Bean
    public CachingConnectionFactory cachingConnectionFactory(){  //CachingConnectionFactory for caching of session, connections, and
        return new CachingConnectionFactory(senderActiveMQConnectionFactory());  //producers as well as automatic connection recovery.
    }

    @Bean
    public JmsTemplate jmsTemplate(){
        return new JmsTemplate(cachingConnectionFactory());
    }

    @Bean
    public Sender sender(){
        return new Sender();
    }
*/
}
