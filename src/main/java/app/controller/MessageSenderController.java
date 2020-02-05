package app.controller;

import app.model.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/send-message")
public class MessageSenderController {

	private RabbitTemplate rabbitTemplate;

	@Autowired
	public MessageSenderController(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
		rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
	}

	@PostMapping(value = "/topic")
	public Order sendTopicMessage(@RequestBody Order order) {
		rabbitTemplate.convertAndSend("example.topic","test", order); //routing key doesn't match exactly with binding but still message is sent as pattern(prefix) matches
		return order;
	}

	@PostMapping(value = "/direct")
	public Order sendDirectMessage(@RequestBody Order order) {
		rabbitTemplate.convertAndSend("example.direct", "test-direct", order);
		return order;
	}

	@PostMapping(value = "/fanout")
	public Order sendFanoutMessage(@RequestBody Order order) {
		rabbitTemplate.convertAndSend("example.fanout", "", order);
		return order;
	}

}
