package com.cibertec.app_web2_T1_DanieloCallata.service;

import java.util.List;

import com.cibertec.app_web2_T1_DanieloCallata.models.Prescription;

public interface PrescriptionService {
	
	
	public List<Prescription> list();
	public Prescription add(Prescription p);
	public Prescription update(Prescription p);
	public void delete(int id);
	

}
