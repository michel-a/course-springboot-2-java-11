package com.malves.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malves.course.entities.Order;
import com.malves.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired // para o spring fazer a injeção dedependência
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		// Order u = new Order(1L, "Maria", "maria@gmail.com", "999999999", "12347"); aula 305
		// return ResponseEntity.ok().body(u);
		
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
