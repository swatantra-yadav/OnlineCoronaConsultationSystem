package com.coronaconsultation.services;

import java.util.List;

import com.coronaconsultation.entities.Doctor;
import com.coronaconsultation.entities.Gender;

public interface IDoctorMaster {
	public boolean createDoctor(Doctor doctor);
	public boolean updateDoctor(int id,Doctor doctor);
	public boolean deleteDoctor(int id);
	public Doctor getDoctor(int id);
	public List<Doctor> getAllDoctors();
	public boolean updateName(int id,String name);
	public boolean updateGender(int id,Gender gender);
	public boolean updateSpecialization(int id,String specialization);
	public boolean updateEmail(int id,String email);
	public boolean updateMobile(int id,String mobile);

}
