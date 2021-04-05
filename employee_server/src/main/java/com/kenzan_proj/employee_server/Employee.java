package com.kenzan_proj.employee_server;

//This class defines an employee

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity  //a JPA annotation to make this object ready 
		 //   for storage in a JPA-based data store
class Employee {
	private @Id @GeneratedValue long id;  //JPA annotations to indicate it is 
	private String firstName;             // a primary key + automatically
	private char midInitial;              // populated by the JPA provider
	private String lastName;
	private String dob;
	private String doe;
	private boolean status;
	
	
	//constructors
	Employee() {}

	Employee(String firstName, char midInitial, String lastName, String dob, String doe) {
		this.firstName = firstName;
		this.midInitial = midInitial;
		this.lastName = lastName;
		this.dob = dob;
		this.doe = doe;
		status = true;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getMidInitial() {
		return midInitial;
	}

	public void setMidInitial(char midInitial) {
		this.midInitial = midInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoe() {
		return doe;
	}

	public void setDoe(String doe) {
		this.doe = doe;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Employee {" + "id=" + this.id + ",name='" + 
				this.firstName + " " + this.midInitial + ". " + this.lastName + 
				", DOB=" + this.dob + ", DOE=" + this.doe + "}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee employee = (Employee) obj;
		return Objects.equals(this.id, employee.id) &&
				Objects.equals(this.firstName, employee.firstName) &&
				Objects.equals(this.midInitial, employee.midInitial) &&
				Objects.equals(this.lastName, employee.lastName) &&
				Objects.equals(this.dob, employee.dob) &&
				Objects.equals(this.doe, employee.doe) &&
				Objects.equals(this.status, employee.status);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.firstName, this.midInitial, this.lastName, this.dob, this.doe, this.status);
	}

}
