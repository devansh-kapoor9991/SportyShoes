package com.comviva.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comviva.webservice.entity.Cart;


public interface UserCartRepository extends JpaRepository<Cart, Long> {
	
}
