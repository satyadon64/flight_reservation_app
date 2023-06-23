package com.flight.reservation.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.reservation.application.entity.User;
import com.flight.reservation.application.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public void saveReg(User user) {
		userRepo.save(user);
	}
	
	public User verifyLogin(String email,String password) {
		User user = userRepo.findByEmailAndPassword(email, password);
		return user;
	}
	

}
