package com.comviva.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comviva.webservice.entity.UserPurchase;

public interface UserpRepository extends JpaRepository<UserPurchase, Long> {
	
}
