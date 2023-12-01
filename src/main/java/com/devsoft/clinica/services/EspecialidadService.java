package com.devsoft.clinica.services;

import java.util.List;

import com.devsoft.clinica.models.Especialidad;

public interface EspecialidadService {

    public Especialidad crearEspecialidad(Especialidad especialidad);
    public List<Especialidad> listarEspecialidades();
    public String eliminarEspecialidadPorId(int id);
    
}
