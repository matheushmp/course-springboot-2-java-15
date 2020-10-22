package com.maingroup.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maingroup.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
