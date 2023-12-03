package com.devsoft.clinica.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Sala;
import com.devsoft.clinica.repositories.CitasRepository;
import com.devsoft.clinica.repositories.SalaRepository;
import com.devsoft.clinica.services.SalasService;

@Service
public class SalaServiceImpl implements SalasService {

    @Autowired
    private SalaRepository salaRepository;

    private CitasRepository citasRepository;

    @Override
    public Sala crearSala(Sala sala) {
        return this.salaRepository.save(sala);
    }

    @Override
    public List<Sala> listarSalas() {
        return this.salaRepository.findAll();
    }

    @Override
    public String eliminarSala(int id) {
        Sala salaEliminar = this.salaRepository.findById(id).get();

        if(salaEliminar != null){
            this.salaRepository.delete(salaEliminar);
            return "Se ha eliminado la sala: " + salaEliminar.getIdSala(); 
        }

        return "No existe la sala con id: " + id;
    }

   

   

}
