package com.devsoft.clinica.services;

import java.util.List;

import com.devsoft.clinica.models.Pacientes;

public interface PacientesService {
    
    public Pacientes crearPaciente(Pacientes nvoPaciente);

    public List<Pacientes> listarPacientes();

    public String borrarPaciente(int id);
}
