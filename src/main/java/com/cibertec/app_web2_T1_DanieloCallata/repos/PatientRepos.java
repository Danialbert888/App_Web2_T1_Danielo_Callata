package com.cibertec.app_web2_T1_DanieloCallata.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.app_web2_T1_DanieloCallata.models.Patient;

public interface PatientRepos extends JpaRepository<Patient, Integer> {
	
	
	@Query("SELECT "
	        + "m.patient_id, "
	        + "m.patient_fname, "
	        + "m.patient_lname, "
	        + "m.patient_adress, "
	        + "m.patient_phone_number, "
	        + "p.pharmacy.pharmacy_id "
	        + "FROM Patient m "
	        + "INNER JOIN Pharmacy p "
	        + "ON m.pharmacy.pharmacy_id = p.pharmacy_id")
	public List<Object[]> getReportPatient();

}
