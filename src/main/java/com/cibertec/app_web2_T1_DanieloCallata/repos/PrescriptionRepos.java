package com.cibertec.app_web2_T1_DanieloCallata.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.app_web2_T1_DanieloCallata.models.Prescription;

public interface PrescriptionRepos extends JpaRepository<Prescription, Integer>  {
	
	
	@Query("SELECT "
	        + "p.prescription_num, "
	        + "pa.patient.patient_id, "
	        + "p.medication_name, "
	        + "p.prescription_date, "
	        + "p.prescription_cost "
	        + "FROM Prescription p "
	        + "INNER JOIN Patient pa "
	        + "ON p.patient.patient_id = pa.patient_id")
	public List<Object[]> getReportPrescription();

}
