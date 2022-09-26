package com.eden.forever.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eden.forever.course.Manos;
import com.eden.forever.repositories.ManoRepository;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner {

	@Autowired
	private ManoRepository manoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Manos u1 = new Manos(null, "dudu","dudu@gmail.com", "90909090", "tata");
		Manos u2 = new Manos(null, "tete", "tete@gmail.com","84848484", "é isso");
	
		manoRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
