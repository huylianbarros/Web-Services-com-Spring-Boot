package com.projetospring.huylian.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.huylian.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
