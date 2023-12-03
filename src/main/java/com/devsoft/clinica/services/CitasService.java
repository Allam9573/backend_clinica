package com.devsoft.clinica.services;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Sala;

public interface CitasService {

    public Sala agregarCitaASala(int id, Citas citas);
    
}
