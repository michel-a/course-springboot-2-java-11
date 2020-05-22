package com.malves.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malves.course.entities.User;
import com.malves.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository; // dependência para UserRepository, a anotação faz a infeção 
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
