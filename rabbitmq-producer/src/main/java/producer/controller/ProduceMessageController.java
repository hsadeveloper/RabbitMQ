package producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import producer.service.ProduceMessageService;


	@RestController
	public class ProduceMessageController {

	    @Autowired
	    ProduceMessageService produceMessageService;

	    @GetMapping("/produce")
	    public String produceMessage() {
	        return produceMessageService.produceMessage("Hello nmmmm");
	    }
	    
    }
