package com.malves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malves.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
