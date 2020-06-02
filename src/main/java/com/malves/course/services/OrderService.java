package com.malves.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malves.course.entities.Order;
import com.malves.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository; // dependência para OrderRepository, a anotação faz a infeção 
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
