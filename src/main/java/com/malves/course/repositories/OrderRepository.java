package com.malves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malves.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
