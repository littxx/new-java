package com.eden.forever.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.forever.course.Manos;
import com.eden.forever.repositories.ManoRepository;

@Service
public class ManoService {
	
	@Autowired
	private ManoRepository repository;
	
	public List<Manos> findAll(){
		return repository.findAll();
	}
	
	public Manos findById(Long id) {
		Optional<Manos> obj = repository.findById(id);
		return obj.get();
	}
	
	public Manos insert(Manos obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
