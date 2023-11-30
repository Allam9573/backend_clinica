package com.devsoft.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoft.clinica.models.Pacientes;

public interface PacientesRepository extends JpaRepository<Pacientes, Integer> {
    
}
