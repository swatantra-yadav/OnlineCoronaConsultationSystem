package com.coronaconsultation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coronaconsultation.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
