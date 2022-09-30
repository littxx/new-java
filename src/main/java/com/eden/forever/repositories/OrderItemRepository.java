package com.eden.forever.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eden.forever.course.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem ,Long> {


	
}
