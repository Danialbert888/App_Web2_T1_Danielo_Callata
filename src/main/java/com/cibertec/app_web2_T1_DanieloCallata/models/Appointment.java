package com.cibertec.app_web2_T1_DanieloCallata.models;

import java.time.LocalDate;
import java.time.LocalTime;

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
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id", referencedColumnName = "patient_id")
	private Patient patient;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id", referencedColumnName = "doctor_id")
	private  Doctor doctor;
	
	private LocalDate date;
	private LocalTime time;

}
