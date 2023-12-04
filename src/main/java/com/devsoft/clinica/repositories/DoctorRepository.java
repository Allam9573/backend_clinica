package com.devsoft.clinica.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsoft.clinica.models.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    @Query(value = "SELECT * FROM doctores WHERE especialidad_id = :especialidadId", nativeQuery = true)
    List<Doctor> findByEspecialidadId(int especialidadId);

}
