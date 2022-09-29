package com.eden.forever.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eden.forever.course.Product;


public interface ProductRepository extends JpaRepository<Product ,Long> {

	
}
