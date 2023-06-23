package com.flight.reservation.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.reservation.application.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
