package com.devsoft.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoft.clinica.models.HorarioCitas;

public interface HorarioCitasRepository extends JpaRepository<HorarioCitas, Integer> {
    
}
