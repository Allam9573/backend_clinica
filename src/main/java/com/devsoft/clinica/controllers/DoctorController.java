package com.devsoft.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.services.impl.DoctorServiceImpl;
import com.devsoft.clinica.services.impl.EspecialidadServiceImpl;

@RestController
@RequestMapping("/api/doctores")
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorServiceImpl;

    @Autowired
    private EspecialidadServiceImpl especialidadServiceImpl;

    @PostMapping("/crear")
    public Doctor crearDoctor(@RequestBody Doctor doctor) {
        System.out.println(doctor.getEspecialidad().getNombre());
        return doctorServiceImpl.crearDoctor(doctor);
    }

    @GetMapping("/listar")
    public List<Doctor> listarDoctores() {
        return doctorServiceImpl.listarDoctores();
    }
}
