package com.devsoft.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoft.clinica.models.HistorialCitas;

public interface HistorialCitasRepository extends JpaRepository<HistorialCitas, Integer>{
    
}
