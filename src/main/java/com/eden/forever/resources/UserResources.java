package com.eden.forever.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eden.forever.course.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		
		User u = new User(1L, "eden", "eden@gmail.com", "11 970750048", "bilada");
		return ResponseEntity.ok().body(u);
	}
}
