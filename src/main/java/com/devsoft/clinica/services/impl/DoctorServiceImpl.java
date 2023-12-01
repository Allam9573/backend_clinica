package com.devsoft.clinica.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.repositories.DoctorRepository;
import com.devsoft.clinica.repositories.EspecialidadRepository;
import com.devsoft.clinica.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public Doctor crearDoctor(Doctor doctor) {

        s
        return this.doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> listarDoctores() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor busDoctorId(int id) {
        return doctorRepository.findById(id).get();
    }

    @Override
    public Doctor eliminarDoctorId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarDoctorId'");
    }

}
