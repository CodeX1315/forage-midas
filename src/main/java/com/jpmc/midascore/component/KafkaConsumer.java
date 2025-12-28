package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    /**
     * This listener waits for messages on the topic defined in application.yml.
     * Spring handles the conversion from JSON to the Transaction object automatically.
     */
    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-core-group")
    public void listen(Transaction transaction) {
        // Task 2 requirements: Just receive the message.
        // Printing helps you verify the data is flowing.
        System.out.println("Received transaction from Kafka: " + transaction.toString());
    }
}