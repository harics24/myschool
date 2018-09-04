package com.febonos.school;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String admissionId;
	private String firstName;
	private String lastName;
	private Date dataOfBirth;
	private Date dataOfJoining;
	private String fathersName;
	private String mothersName;
	private String contactNumber;
	private String altContactNumber;
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}