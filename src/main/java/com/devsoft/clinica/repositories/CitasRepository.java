package com.devsoft.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoft.clinica.models.Citas;

public interface CitasRepository extends JpaRepository<Citas , Integer>{
    
}
