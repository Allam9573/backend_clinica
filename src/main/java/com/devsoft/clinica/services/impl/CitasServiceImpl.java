package com.devsoft.clinica.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Sala;
import com.devsoft.clinica.repositories.CitasRepository;
import com.devsoft.clinica.repositories.SalaRepository;
import com.devsoft.clinica.services.CitasService;

@Service
public class CitasServiceImpl implements CitasService {

    @Autowired
    private CitasRepository citasRepository;

    @Autowired
    private SalaRepository salaRepository;
    
    @Override
    public Sala agregarCitaASala(int id, Citas citas) {
        Sala salaAct = this.buscarSala(id);

        if(salaAct != null){
            citas.setSalas(salaAct);
            this.citasRepository.save(citas);
        }

        return salaAct;
    }

    private Sala buscarSala(int id){
        return this.salaRepository.findById(id).get();
    }
    
}
