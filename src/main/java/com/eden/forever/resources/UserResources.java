package com.eden.forever.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eden.forever.course.Manos;

@RestController
@RequestMapping(value = "/manos")
public class UserResources {

	
	@GetMapping
	public ResponseEntity<Manos> findAll(){
		
		
		Manos u = new Manos(1L, "eden", "eden@gmail.com", "11 970750048", "bilada");
		return ResponseEntity.ok().body(u);
	}
}
