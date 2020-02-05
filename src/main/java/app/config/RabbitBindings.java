package app.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitBindings {
	@Bean("queue1")
	public Queue queue1() {
		return new Queue("queue1");
	}

	@Bean("queue2")
	public Queue queue2() {
		return new Queue("queue2");
	}

	@Bean("queue3")
	public Queue queue3() {
		return new Queue("queue3");
	}

	@Bean("queue4")
	public Queue queue4() {
		return new Queue("queue4");
	}

	@Bean("queue5")
	public Queue queue5() {
		return new Queue("queue5");
	}

	@Bean
	public TopicExchange topicExchange() {
		return new TopicExchange("example.topic");
	}

	@Bean
	public DirectExchange directExchange() {
		return new DirectExchange("example.direct");
	}

	@Bean
	public FanoutExchange fanoutExchange() {
		return new FanoutExchange("example.fanout");
	}

	@Bean
	public Binding binding1(Queue queue1, TopicExchange topicExchange) {
		return BindingBuilder.bind(queue1).to(topicExchange).with("test-topic");
	}

	@Bean
	public Binding binding2(Queue queue2, DirectExchange directExchange) {
		return BindingBuilder.bind(queue2).to(directExchange).with("test-direct");
	}

	@Bean
	public Binding binding3(Queue queue3, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(queue3).to(fanoutExchange);
	}

	@Bean
	public Binding binding4(Queue queue4, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(queue4).to(fanoutExchange);
	}

	@Bean
	public Binding binding5(Queue queue5, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(queue5).to(fanoutExchange);
	}
}
