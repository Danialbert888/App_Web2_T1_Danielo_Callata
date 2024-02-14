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
@Table(name = "departament")
public class Departament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departament_id;
	private String departament_name;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hospital_id", referencedColumnName = "hospital_id")
	private Hospital hospital;

}
