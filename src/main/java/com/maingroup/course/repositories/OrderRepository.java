package com.maingroup.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maingroup.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
