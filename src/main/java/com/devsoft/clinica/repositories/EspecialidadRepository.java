package com.devsoft.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoft.clinica.models.Especialidad;

public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer>{
    
}
