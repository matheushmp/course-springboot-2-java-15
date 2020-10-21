package com.maingroup.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maingroup.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
