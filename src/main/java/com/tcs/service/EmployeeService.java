package com.tcs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.entity.Employee;
import com.tcs.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository er;

	public EmployeeService(EmployeeRepository er) {

		this.er = er;
	}

	public List<Employee> findAll() {
		return er.findAll();

	}

	public Employee addEmployee(Employee emp) {

		return er.save(emp);
	}

	public Employee updateEmployee(long id, Employee newEmp) {
		Employee exEmp = er.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));

		exEmp.setName(newEmp.getName());
		exEmp.setRole(newEmp.getRole());
		exEmp.setSalary(newEmp.getSalary());
		exEmp.setEmail(newEmp.getEmail());

		er.save(exEmp);

		return exEmp;
	}

	public long deleteEmployee(long id) {
		Employee emp = er.findById((long) id).orElseThrow(() -> new RuntimeException("Employee not found"));

		er.delete(emp);

		return id;
	}
}
