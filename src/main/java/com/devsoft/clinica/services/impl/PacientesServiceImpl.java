package com.devsoft.clinica.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.clinica.models.Pacientes;
import com.devsoft.clinica.repositories.PacientesRepository;
import com.devsoft.clinica.services.PacientesService;

@Service
public class PacientesServiceImpl implements PacientesService {

    @Autowired
    private PacientesRepository pacientesRepository;

    @Override
    public Pacientes crearPaciente(Pacientes nvoPaciente) {
        return this.pacientesRepository.save(nvoPaciente);        
    }

    @Override
    public List<Pacientes> listarPacientes() {
      return this.pacientesRepository.findAll();
    }

    @Override
    public String borrarPaciente(int id) {
        Pacientes pteEliminar = this.pacientesRepository.findById(id).get();

        if(pteEliminar != null){
            this.pacientesRepository.delete(pteEliminar);
            return "Se ha eliminado el cliente: " + pteEliminar.getIdPaciente(); 
        }

        return "No existe el cliente con dni: " + id;
    }
    
}
