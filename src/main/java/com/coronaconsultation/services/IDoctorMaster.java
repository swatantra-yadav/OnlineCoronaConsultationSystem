package com.coronaconsultation.services;

import com.coronaconsultation.entities.Doctor;

public interface IDoctorMaster {
	public boolean createDoctor(Doctor doctor);
	public boolean updateDoctor(Doctor doctor);
	public boolean deleteDoctor(Doctor Doctor);

}
