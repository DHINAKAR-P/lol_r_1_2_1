package com.commontest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commontest.model.Address;
import com.commontest.model.Employee;
import com.commontest.service.EmployeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeService employeeService;

	@SuppressWarnings("unused")
	@PostMapping("create")
	private Employee create(@RequestBody Employee emp) {
		System.out.println("emp -- > "+emp.toString());
//		Employee em = new Employee();
//		em.setAddress(emp.getAddress());
		return employeeService.create(emp);
	}
	
	@GetMapping("getall")
	private List<Employee> getall() {
		return employeeService.getall();
	}
	
}
