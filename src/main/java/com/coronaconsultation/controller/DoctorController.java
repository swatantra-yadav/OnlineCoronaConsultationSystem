package com.coronaconsultation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coronaconsultation.entities.Doctor;
import com.coronaconsultation.services.DoctorMasterImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RequestMapping("api/Doctor/")
public class DoctorController {
	@Autowired
	private DoctorMasterImpl doctorMasterImpl;
	public ResponseEntity<String> createDoctor(@RequestBody Doctor doctor){
		doctorMasterImpl.createDoctor(doctor);
		return new ResponseEntity<>("Doctor Created!!",HttpStatus.OK);
		
	}
	

}
