package app.controller;

import app.model.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/send-message")
public class MessageSenderController {

	@PostMapping(value = "/topic")
	public Order sendTopicMessage(@RequestBody Order order) throws JsonProcessingException {
		System.out.println(new ObjectMapper().writeValueAsString(order));
		return order;
	}

}
