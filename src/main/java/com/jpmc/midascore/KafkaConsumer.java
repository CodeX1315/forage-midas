//package com.jpmc.midascore;
//
//import com.jpmc.midascore.foundation.Transaction;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaConsumer {
//
//    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-core")
//    public void listen(Transaction transaction) {
//        // 🔴 BREAKPOINT HERE
//        System.out.println("TRANSACTION AMOUNT FOUND: " + transaction.getAmount());
//    }
//}
