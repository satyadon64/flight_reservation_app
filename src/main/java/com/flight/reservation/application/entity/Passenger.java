package com.flight.reservation.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity


public class Passenger extends AbstractEntity{
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	@Column(length = 50,nullable = false)
	private String email;
	
	@Column(length = 10,nullable = false)
	private String phone;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Passenger(String firstName, String middleName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	public Passenger() {
	
	}

}
