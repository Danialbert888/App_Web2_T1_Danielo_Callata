package com.cibertec.app_web2_T1_DanieloCallata.service;

import java.util.List;

import com.cibertec.app_web2_T1_DanieloCallata.models.Pharmacy;

public interface PharmacyService {

	
	public List<Pharmacy> list();
	public Pharmacy add(Pharmacy p);
	public Pharmacy update(Pharmacy p);
	public void delete(int id);
}
