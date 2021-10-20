package com.comviva.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comviva.webservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
