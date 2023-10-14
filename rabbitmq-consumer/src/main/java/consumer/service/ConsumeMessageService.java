package consumer.service;

import org.springframework.stereotype.Service;

@Service

public class ConsumeMessageService {

    public void consumeMessage(String messageBody) {
       System.out.println("Consumed Message: " + messageBody);
    }
}