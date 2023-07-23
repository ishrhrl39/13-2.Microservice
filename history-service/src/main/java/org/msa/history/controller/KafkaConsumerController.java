package org.msa.history.controller;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaConsumerController {

	@KafkaListener(topics = "${topic.name}", groupId = ConsumerConfig.GROUP_ID_CONFIG)
    public void consume(String data) throws IOException {
        System.out.println(String.format("Consumed data : %s", data));
    }

}