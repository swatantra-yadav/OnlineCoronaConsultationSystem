package com.coronaconsultation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coronaconsultation.entities.Employee;
import com.coronaconsultation.services.EmployeeMasterImpl;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {
	@Autowired
	private EmployeeMasterImpl employeeMasterImpl;
	@PostMapping("/")
public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
		
		employeeMasterImpl.createEmployee(employee);
		return new ResponseEntity<>("Employee Created", HttpStatus.OK);
	}

}
