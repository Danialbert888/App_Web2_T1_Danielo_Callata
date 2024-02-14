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
@Table(name = "staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staff_id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departament_id", referencedColumnName = "departament_id")
	private Departament departament;
	
	private String staff_fname;
	private String staff_lname;
	private String staff_adress;
	private String staff_phone_number;
}
