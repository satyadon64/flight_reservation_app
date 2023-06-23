package com.flight.reservation.application.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.reservation.application.entity.Flight;
import com.flight.reservation.application.repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepo;
	
	
	public List<Flight> findFlights(String from,String to,Date date){
		
		List<Flight> flights = flightRepo.findByDepartureCityAndArrivalCityAndDateOfDeparture(from, to, date);
		return flights;
		
	}

	public Flight getFlightById(int id) {
		return flightRepo.findById(id).get();
	}

}
