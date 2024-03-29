package com.cibertec.app_web2_T1_DanieloCallata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.app_web2_T1_DanieloCallata.models.Patient;
import com.cibertec.app_web2_T1_DanieloCallata.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientservice;

	
	
	@GetMapping
	public ResponseEntity<List<Patient>> list(){
		return  new ResponseEntity<>(patientservice.list(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<Patient> add(@RequestBody Patient c) {
		return new ResponseEntity<>(patientservice.add(c), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Patient> update(@RequestBody Patient c) {
		return new ResponseEntity<>(patientservice.update(c), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		patientservice.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
