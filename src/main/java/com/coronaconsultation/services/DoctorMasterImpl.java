package com.coronaconsultation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.coronaconsultation.entities.Doctor;
import com.coronaconsultation.entities.Gender;
import com.coronaconsultation.repository.DoctorRepository;

@Service
public class DoctorMasterImpl implements IDoctorMaster{
@Autowired
private DoctorRepository doctorRepository;

@Override
public boolean createDoctor(Doctor doctor) {
	// TODO Auto-generated method stub
	if(doctor!=null)
	{
		doctorRepository.save(doctor);
		return true;
	}
	return false;
}

@Override
public boolean updateDoctor(int id,Doctor doctor) {
	Doctor doc = doctorRepository.findById(id).get();

	if (doc!=null) {
		
		doctorRepository.save(doc);
		return true;
		
	}

	
	return false;
}


@Override
public boolean deleteDoctor(int id) {
	// TODO Auto-generated method stub
	Doctor doc =doctorRepository.findById(id).get();
	if(doc!=null) {
		doctorRepository.deleteById(id);;
		return true;
	}
	return false;
}

@Override
public Doctor getDoctor(int id) {
	// TODO Auto-generated method stub
	Doctor doc= doctorRepository.findById(id).get();
	if(doc!=null) {
		return doc;
	}
	return null;
}

@Override
public List<Doctor> getAllDoctors() {
	// TODO Auto-generated method stub
	   List<Doctor> doctor= doctorRepository.findAll();
	   if(doctor!=null) {
		   return doctor;
	   }
	return null;
}

@Override
public boolean updateName(int id, String name) {
	// TODO Auto-generated method stub
	Doctor doc = doctorRepository.findById(id).get();

	if (doc!=null) {
		doc.setName(name);

		doctorRepository.save(doc);
		return true;
	}
	return false;
}

@Override
public boolean updateGender(int id, Gender gender) {
	// TODO Auto-generated method stub
	Doctor doc = doctorRepository.findById(id).get();

	if (doc!=null) {
		doc.setGender(gender);

		doctorRepository.save(doc);
		return true;
	}
	
	return false;
}

@Override
public boolean updateSpecialization(int id, String specialization) {
	// TODO Auto-generated method stub
	Doctor doc = doctorRepository.findById(id).get();

	if (doc!=null) {
		doc.setSpecialization(specialization);

		doctorRepository.save(doc);
		return true;
	}
	return false;
}

@Override
public boolean updateEmail(int id, String email) {
	// TODO Auto-generated method stub
	Doctor doc = doctorRepository.findById(id).get();

	if (doc!=null) {
		doc.setEmail(email);
		doctorRepository.save(doc);
		return true;
	}
	
	
	return false;
}

@Override
public boolean updateMobile(int id, String mobile) {
	// TODO Auto-generated method stub
	Doctor doc = doctorRepository.findById(id).get();

	if (doc!=null) {
		doc.setMobile(mobile);

		doctorRepository.save(doc);
		return true;
	}
	
	
	return false;
}

}
