package com.devsoft.clinica.services;

import java.util.List;

import com.devsoft.clinica.models.Sala;

public interface SalasService {

    public Sala crearSala(Sala sala);

    public List<Sala> listarSalas();

    public void eliminarSala(int id);

}
