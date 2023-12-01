package com.devsoft.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.services.impl.DoctorServiceImpl;

@RestController
@RequestMapping("/api/doctores")
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorServiceImpl;

    @PostMapping("/crear")
    public Doctor crearDoctor(@RequestBody Doctor doctor) {
        return doctorServiceImpl.crearDoctor(doctor);
    }

}
