package com.coronaconsultation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coronaconsultation.entities.Doctor;
import com.coronaconsultation.repository.DoctorRepository;

@Service
public class DoctorMasterImpl implements IDoctorMaster{
@Autowired
private DoctorRepository doctorRepository;

@Override
public boolean createDoctor(Doctor doctor) {
	// TODO Auto-generated method stub
	doctorRepository.save(doctor);
	return true;
}

@Override
public boolean updateDoctor(Doctor doctor) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean deleteDoctor(Doctor Doctor) {
	// TODO Auto-generated method stub
	return false;
}

}
