package com.flight.reservation.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.reservation.application.entity.User;
import com.flight.reservation.application.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/showReg")
	public String showReg() {
		return "/login/showReg";
	}
	
	@RequestMapping("/logIn")
	public String logIn() {
		return "/login/login";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute User user) {
		userService.saveReg(user);
		
		return "/login/login";
	}
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email,@RequestParam("password") String password,Model model) {
		User user = userService.verifyLogin(email, password);
		if(user!=null) {
			return "/flights/findFlights";
		}else {
		model.addAttribute("error", "Invalid email/password");
		return "/login/login";
	}
		}

}
