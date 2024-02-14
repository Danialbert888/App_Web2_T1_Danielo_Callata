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

import com.cibertec.app_web2_T1_DanieloCallata.models.Prescription;
import com.cibertec.app_web2_T1_DanieloCallata.service.PrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
	
	@Autowired
	PrescriptionService prescriptionservice;
	
	
	@GetMapping
	public ResponseEntity<List<Prescription>> list(){
		return  new ResponseEntity<>(prescriptionservice.list(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<Prescription> add(@RequestBody Prescription c) {
		return new ResponseEntity<>(prescriptionservice.add(c), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Prescription> update(@RequestBody Prescription c) {
		return new ResponseEntity<>(prescriptionservice.update(c), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		prescriptionservice.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
