package com.coronaconsultation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coronaconsultation.entities.Employee;
import com.coronaconsultation.repository.EmployeeRepository;
@Service
public class EmployeeMasterImpl implements IEmployeeMaster {
@Autowired
private EmployeeRepository employeeRepository;

@Override
public boolean createEmployee(Employee employee) {
	// TODO Auto-generated method stub
	employeeRepository.save(employee);
	return false;
}

}
