package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.medical;

public interface MedicalRepo extends JpaRepository<medical, Integer> {

}

