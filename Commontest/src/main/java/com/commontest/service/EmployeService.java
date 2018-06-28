package com.commontest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commontest.Repository.EmployeeRepository;
import com.commontest.model.Employee;

@Service
public class EmployeService {

	@Autowired
	private EmployeeRepository employrepo;

	@Transactional
	public Employee create(Employee emp) {
		return employrepo.save(emp);
	}

	public List<Employee> getall() {
		return employrepo.findAll();
	}
}
