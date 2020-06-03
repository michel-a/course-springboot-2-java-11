package com.malves.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malves.course.entities.Category;
import com.malves.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired // para o spring fazer a injeção dedependência
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		// Category u = new Category(1L, "Maria", "maria@gmail.com", "999999999", "12347"); aula 305
		// return ResponseEntity.ok().body(u);
		
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
