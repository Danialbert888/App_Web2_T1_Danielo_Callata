package com.cibertec.app_web2_T1_DanieloCallata.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctor_id;
	private String doctor_fname;
	private String doctor_lname;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departament_id", referencedColumnName = "departament_id")
	private Departament departament;
	
	private String doctor_phone_number;
	
}
