package com.flight.reservation.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.reservation.application.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
