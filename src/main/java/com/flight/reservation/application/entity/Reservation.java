package com.flight.reservation.application.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import org.hibernate.annotations.CreationTimestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Reservation extends AbstractEntity{
	
	private boolean checkedIn;
	private int numberOfBags;
	@CreationTimestamp
	private Timestamp createTimestamp;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}
	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Reservation(boolean checkedIn, int numberOfBags, Passenger passenger,Flight flight) {
		super();
		this.checkedIn = checkedIn;
		this.numberOfBags = numberOfBags;
		this.passenger = passenger;
		this.flight = flight;
	}
	public Reservation() {
		
	}
	

}
