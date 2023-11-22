package com.devsoft.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoft.clinica.models.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
    
}
