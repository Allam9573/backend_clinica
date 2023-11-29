package com.devsoft.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.services.impl.DoctorServiceImpl;

@RestController
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorServiceImpl;

    public Doctor crearDoctor(@RequestBody Doctor doctor) {
        return this.doctorServiceImpl.crearDoctor(doctor);
    }

}
