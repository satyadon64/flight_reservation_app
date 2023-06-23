package com.flight.reservation.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight.reservation.application.entity.Reservation;
import com.flight.reservation.application.payload.BookingDetails;
import com.flight.reservation.application.service.PassengerService;

@Controller
public class ReservationController {
	
	@Autowired
	private PassengerService passengerService;
	
	@RequestMapping("/bookingDetails")
	public String bookingDetails(BookingDetails details,Model model) {
		Reservation reservation = passengerService.bookingDetails(details);
		model.addAttribute("reservation", reservation);
		return "/flights/finalPage";
		
	}

}
