package com.devsoft.clinica.services.impl;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.models.Pacientes;
import com.devsoft.clinica.models.Sala;
import com.devsoft.clinica.repositories.CitasRepository;
import com.devsoft.clinica.repositories.DoctorRepository;
import com.devsoft.clinica.repositories.PacientesRepository;
import com.devsoft.clinica.repositories.SalaRepository;
import com.devsoft.clinica.services.CitasService;
import com.devsoft.clinica.services.DoctorService;
import com.devsoft.clinica.services.PacientesService;
import com.devsoft.clinica.services.SalasService;

import jakarta.transaction.Transactional;

@Service
public class CitasServiceImpl implements CitasService {

    @Autowired
    private CitasRepository citasRepository;

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PacientesRepository pacientesRepository;

    @Autowired
    private PacientesService pacienteService;
    
    @Autowired
    private DoctorService doctorService;

    @Autowired
    private SalasService salaService;
    
    // @Override
    // public Sala agregarCitaASala(int id, Citas citas) {
    //     Sala salaAct = this.buscarSala(id);

    //     if(salaAct != null){
    //         citas.setSalas(salaAct);
    //         this.citasRepository.save(citas);
    //     }

    //     return salaAct;
    // }

    private Sala buscarSala(int id){
        return this.salaRepository.findById(id).get();
    }

    // @Override
    // public Doctor agregarCitasDoctore(int id, Citas citas) {
    //    Doctor doctorAct = this.buscarDoctor(id);

    //     if(doctorAct != null){
    //         citas.setDoctor(doctorAct);
    //         this.citasRepository.save(citas);
    //     }

    //     return doctorAct;
    // }

    private Doctor buscarDoctor(int id){
        return this.doctorRepository.findById(id).get();
    }

    // @Override
    // public Pacientes agregarCitasPaciente(int id, Citas citas) {
    //   Pacientes pacienteAct = this.buscarPaciente(id);

    //     if(pacienteAct != null){
    //         citas.setPacientes(pacienteAct);
    //         this.citasRepository.save(citas);
    //     }

    //     return pacienteAct;
    // }

    private Pacientes buscarPaciente(int id){
        return this.pacientesRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void agregarCita(int idPaciente, int idDoctor, int idSala) {
        Pacientes paciente = buscarPaciente(idPaciente);
        Doctor doctor = buscarDoctor(idDoctor);
        Sala sala = buscarSala(idSala);
    
        Citas nuevaCita = new Citas(); // Mover la creación de nuevaCita aquí
        nuevaCita.setFechaCita(LocalDate.now());
        nuevaCita.setHoraCita(LocalTime.now());
        nuevaCita.setPacientes(paciente);
        nuevaCita.setDoctor(doctor);
        nuevaCita.setSalas(sala);
    
        paciente.getCitas().add(nuevaCita);
        doctor.getCitas().add(nuevaCita);
        sala.getCitas().add(nuevaCita);
    
        pacienteService.crearPaciente(paciente);
        doctorService.crearDoctor(doctor);
        salaService.crearSala(sala);
    
        citasRepository.save(nuevaCita);
    }

    
    
}
