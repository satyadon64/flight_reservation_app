package com.flight.reservation.application.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.reservation.application.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	List<Flight> findByDepartureCityAndArrivalCityAndDateOfDeparture(String departureCity,String arrivalCity,Date dateOfDeparture );
	
	
}
