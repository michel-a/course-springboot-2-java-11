package com.malves.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malves.course.entities.Product;
import com.malves.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository; // dependência para ProductRepository, a anotação faz a infeção 
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
