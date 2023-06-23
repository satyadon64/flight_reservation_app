package com.flight.reservation.application.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.reservation.application.entity.Flight;
import com.flight.reservation.application.entity.Passenger;
import com.flight.reservation.application.entity.Reservation;
import com.flight.reservation.application.payload.BookingDetails;
import com.flight.reservation.application.repository.FlightRepository;
import com.flight.reservation.application.repository.PassengerRepository;
import com.flight.reservation.application.repository.ReservationRepository;

@Service
public class PassengerService {
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	
	public Reservation bookingDetails(BookingDetails details) {
		Passenger passenger= new Passenger(details.getFirstName(),details.getMiddleName(),details.getLastName(),details.getEmail(),details.getPhone());
		Passenger p1 = passengerRepo.save(passenger);
		
		Flight flight = flightRepo.findById(details.getFlightId()).get();
		
		Reservation reservation= new Reservation(false,0,p1,flight);
		
		Reservation r1 = reservationRepo.save(reservation);
		return r1;
	}

}
