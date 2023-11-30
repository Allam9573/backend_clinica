package com.devsoft.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoft.clinica.models.Salas;

public interface SalasRepository extends JpaRepository<Salas, Integer> {
    
}
