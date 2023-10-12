package producer.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import producer.configuration.RabbitMQConfig;

@Service
public class ProduceMessageService {

    private final RabbitTemplate rabbitTemplate;

    public ProduceMessageService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public String produceMessage(String message) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, "myRoutingKey.messages",
                message);
        return "Message( " + message + ")  ------->>  " + " has been produced.";
    }
}