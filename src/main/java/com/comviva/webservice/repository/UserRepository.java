package com.comviva.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comviva.webservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findById(String iid);
	
}
