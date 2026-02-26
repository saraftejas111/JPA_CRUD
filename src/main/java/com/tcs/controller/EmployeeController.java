package com.tcs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Employee;
import com.tcs.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:5173")
public class EmployeeController {

	private final EmployeeService es;

	public EmployeeController(EmployeeService es) {
		super();
		this.es = es;
	}

	@GetMapping("show-all-url")
	public List<Employee> findAll() {
		return es.findAll();

	}

	@PostMapping("add-employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return es.addEmployee(emp);
	}
	
	@PutMapping("update-employee/{id}")
	public Employee updateEmployee(@PathVariable long id , @RequestBody Employee emp) {
		return es.updateEmployee((long)id , emp);
	}

	@DeleteMapping("delete-employee/{id}")
	public long deleteEmployee(@PathVariable long id) {
		return es.deleteEmployee((long)id);
	}
}
