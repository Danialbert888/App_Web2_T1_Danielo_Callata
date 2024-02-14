package com.cibertec.app_web2_T1_DanieloCallata.service;

import java.util.List;

import com.cibertec.app_web2_T1_DanieloCallata.models.Patient;

public interface PatientService {

	public List<Patient> list();
	public Patient add(Patient p);
	public Patient update(Patient p);
	public void delete(int id);
}
