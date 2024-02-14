package com.cibertec.app_web2_T1_DanieloCallata.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.cibertec.app_web2_T1_DanieloCallata.models.Pharmacy;

public interface PharmacyRepos extends JpaRepository<Pharmacy, Integer> {
	
	@Query("SELECT "
	        + "pharmacy_id, "
	        + "pharmacy_name, "
	        + "pharmacy_adress, "
	        + "pharmacy_phone_number "
	        + "FROM Pharmacy  ")
	public List<Object[]> getReportPharmacy();

}
