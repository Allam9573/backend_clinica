package com.devsoft.clinica.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.clinica.models.Especialidad;
import com.devsoft.clinica.repositories.EspecialidadRepository;
import com.devsoft.clinica.services.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;


    @Override
    public Especialidad crearEspecialidad(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public List<Especialidad> listarEspecialidades() {
        return especialidadRepository.findAll();
    }

    @Override
    public String eliminarEspecialidadPorId(int id) {
        Especialidad especialidad = especialidadRepository.findById(id).get();
        if(especialidad != null){
            especialidadRepository.delete(especialidad);
            return "eliminado";
        }
        return "No existe";
    }
    
}
