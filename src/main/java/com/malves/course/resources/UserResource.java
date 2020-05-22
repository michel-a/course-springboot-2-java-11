package com.malves.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malves.course.entities.User;
import com.malves.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired // para o spring fazer a injeção dedependência
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		// User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "12347"); aula 305
		// return ResponseEntity.ok().body(u);
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
