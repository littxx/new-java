package com.eden.forever.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eden.forever.course.Category;


public interface CategoryRepository extends JpaRepository<Category ,Long> {

	
}
