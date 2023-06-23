package com.flight.reservation.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.reservation.application.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
User findByEmailAndPassword(String email, String password);	

}
