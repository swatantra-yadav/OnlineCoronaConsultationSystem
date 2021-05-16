package com.coronaconsultation.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Services {
	@Id
	//@GeneratedValue(strategy =GenerationType.)
	private int id;
	private ServiceType serviceType;
	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;
	private boolean Condition;
	
	

}
