package com.eden.forever.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eden.forever.course.Manos;
import com.eden.forever.service.ManoService;

@RestController
@RequestMapping(value = "/manos")
public class ManosResources {

	@Autowired
	private ManoService service;
	
	@GetMapping
	public ResponseEntity<List<Manos>> findAll(){
		
		List<Manos> list = service.findAll();
				
		
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Manos> findById(@PathVariable Long id){
		Manos obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
