package com.cibertec.app_web2_T1_DanieloCallata.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pharmacy")
public class Pharmacy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pharmacy_id;
	private String pharmacy_name;
	private String pharmacy_adress;
	private String pharmacy_phone_number;

}
