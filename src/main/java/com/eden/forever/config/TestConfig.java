package com.eden.forever.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eden.forever.course.Manos;
import com.eden.forever.entities.Order;
import com.eden.forever.repositories.ManoRepository;
import com.eden.forever.repositories.OrderRepository;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner {

	@Autowired
	private ManoRepository manoRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Manos u1 = new Manos(null, "dudu","dudu@gmail.com", "90909090", "tata");
		Manos u2 = new Manos(null, "tete", "tete@gmail.com","84848484", "é isso");
	
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		manoRepository.saveAll(Arrays.asList(u1,u2));
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
	
}
