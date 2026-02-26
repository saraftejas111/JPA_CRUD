package com.tcs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	private String name ;
	
	private String role ; 
	
	private String email ;
	
	private double salary ;

	public Employee(String name, String role, String email, double salary) {
		super();
		this.name = name;
		this.role = role;
		this.email = email;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
