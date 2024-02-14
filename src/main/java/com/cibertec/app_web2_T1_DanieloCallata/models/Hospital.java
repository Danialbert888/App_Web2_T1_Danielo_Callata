package com.cibertec.app_web2_T1_DanieloCallata.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Entity
@Table(name="hospital")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hospital_id;
	private String hospital_name;
	private String hospital_adress;
	private String hospital_phone_number;
	private String state;
	private String zip_code;
	

}
