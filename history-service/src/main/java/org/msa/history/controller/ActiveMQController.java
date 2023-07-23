package org.msa.history.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ActiveMQController {

    @JmsListener(destination = "${activemq.broker.topic}", containerFactory = "jmsListenerContainerFactory")
    public void pullHistory(String json) {
        log.info(" - activeMq pull = {}", json);
    }

}