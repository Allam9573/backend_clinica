package com.devsoft.clinica.services;

import java.util.List;

import com.devsoft.clinica.models.Doctor;

public interface DoctorService {

    public Doctor crearDoctor(Doctor doctor);

    public List<Doctor> listarDoctores();

    public Doctor busDoctorId(int id);

    public Doctor eliminarDoctorId(int id);

}
