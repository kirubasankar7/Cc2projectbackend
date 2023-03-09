package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.medical;
import com.example.demo.repositories.MedicalRepo;

@Service
public class medicalservice {
	@Autowired
	MedicalRepo repository;
	public String updateDetails(medical pt) {
		repository.save(pt);
		return "updated";
	}
	public String deleteDetails(int id)
	{
		repository.deleteById(id);
		return "Id deleted";
	}

}
