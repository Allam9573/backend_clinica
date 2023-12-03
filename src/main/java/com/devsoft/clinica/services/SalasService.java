package com.devsoft.clinica.services;

import java.util.List;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Sala;

public interface SalasService {

    public Sala crearSala(Sala sala);

    public List<Sala> listarSalas();

    public String eliminarSala(int id);

    
    

}
