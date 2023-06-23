package com.flight.reservation.application.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.reservation.application.entity.Flight;
import com.flight.reservation.application.service.FlightService;

@Controller
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@RequestMapping("/searchFlight")
	public String flightDetails(@RequestParam String from,@RequestParam String to,
			@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date,Model model) {
		
		
		List<Flight> flights = flightService.findFlights(from, to, date);
		if(!flights.isEmpty()) {
			model.addAttribute("flights", flights);
		return "/flights/flightDetails";		
	}
		else {
		model.addAttribute("blank", "No flights are available on this date");
		return "/flights/findFlights";
	}
		
		}
	
	@RequestMapping("/addPassenger")
	public String addPassenger(@RequestParam("flightId") int flightId,Model model) {
		Flight flight = flightService.getFlightById(flightId);
		model.addAttribute("flight", flight);
		return "/flights/addPassenger";
		
	}
	
	

}
