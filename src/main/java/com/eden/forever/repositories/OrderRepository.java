package com.eden.forever.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eden.forever.course.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
