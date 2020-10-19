package com.maingroup.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maingroup.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
