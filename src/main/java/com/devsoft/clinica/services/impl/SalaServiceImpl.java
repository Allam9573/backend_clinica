package com.devsoft.clinica.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.clinica.models.Sala;
import com.devsoft.clinica.repositories.SalaRepository;
import com.devsoft.clinica.services.SalasService;

@Service
public class SalaServiceImpl implements SalasService {

    @Autowired
    private SalaRepository salaRepository;

    @Override
    public Sala crearSala(Sala sala) {
        return this.salaRepository.save(sala);
    }

    @Override
    public List<Sala> listarSalas() {
        return this.salaRepository.findAll();
    }

    @Override
    public void eliminarSala(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarSala'");
    }

}
