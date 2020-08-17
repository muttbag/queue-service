package co.uk.queue.group.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class QueueServiceImpl implements QueueService {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    private int i = 1;


    @Override
    public String addMessage() throws IOException {

        rabbitTemplate.convertAndSend("myExchange", "routingkey", "Message Number " +i +"! new message for queue!");
        return "Message " + i++ + " added to queue!";
    }


}