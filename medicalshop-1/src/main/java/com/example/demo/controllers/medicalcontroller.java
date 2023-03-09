package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.medical;
import com.example.demo.repositories.MedicalRepo;
import com.example.demo.service.medicalservice;

@RestController
@CrossOrigin
public class medicalcontroller {
    @Autowired
    MedicalRepo serviceRepository;
    @Autowired
    medicalservice service;
    @GetMapping("/get")
	List<medical> getList()
	{
	return serviceRepository.findAll();

	}
	@PostMapping("/post")
	public medical create(@RequestBody medical pt)
	{
		
		return serviceRepository.save(pt);
	}
	@PutMapping("/put")

	public String update(@RequestBody medical pt)
	{
		return service.updateDetails(pt);
	}
	
	@DeleteMapping("/delete")

	public String delete(@RequestParam int id)
	{
	   return service.deleteDetails(id);
	}
}
	
