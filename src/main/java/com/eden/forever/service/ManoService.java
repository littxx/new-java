package com.eden.forever.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.eden.forever.course.Manos;
import com.eden.forever.repositories.ManoRepository;
import com.eden.forever.service.exceptions.DatabaseException;
import com.eden.forever.service.exceptions.ResourceNotFoundException;

@Service
public class ManoService {

	@Autowired
	private ManoRepository repository;

	public List<Manos> findAll() {
		return repository.findAll();
	}

	public Manos findById(Long id) {
		Optional<Manos> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Manos insert(Manos obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	public Manos update(Long id, Manos obj) {
		try {
			Manos entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(Manos entity, Manos obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}

}
