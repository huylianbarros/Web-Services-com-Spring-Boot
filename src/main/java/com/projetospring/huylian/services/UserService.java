package com.projetospring.huylian.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospring.huylian.entities.User;
import com.projetospring.huylian.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findByid(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
