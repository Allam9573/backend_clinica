package com.devsoft.clinica.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.models.Especialidad;

public interface DoctorService {

    public Doctor crearDoctor(Doctor doctor);

    public List<Doctor> listarDoctores();

    public Doctor busDoctorId(int id);

    public String eliminarDoctorId(int id);

    public Especialidad agregarDoctorEspecialidad(int id, Doctor doctor);



}
