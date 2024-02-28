package com.kafkalearn.consumer;

import com.kafkalearn.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class KafkaMessageListener {
    Logger log =  LoggerFactory.getLogger(KafkaMessageListener.class);
    @KafkaListener(topics = "rakesh-demo-6" ,groupId = "jt-group-new-2")
    public void consume(Customer customer){
        log.info("consumer consume the event {} ", customer.toString());
    }
//    @KafkaListener(topics = "rakesh-demo-4" ,groupId = "jt-group")
//    public void consume2(String message){
//        log.info("consumer2 consume the message {} ", message);
//    }
//    @KafkaListener(topics = "rakesh-demo-4" ,groupId = "jt-group")
//    public void consume3(String message){
//        log.info("consumer3 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "rakesh-demo-4" ,groupId = "jt-group")
//    public void backup(String message){
//        log.info("consumerBackup consume the message {} ", message);
//    }

}
