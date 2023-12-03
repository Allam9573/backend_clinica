package com.devsoft.clinica.services;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.models.Pacientes;
import com.devsoft.clinica.models.Sala;

public interface CitasService {

    public Sala agregarCitaASala(int id, Citas citas);
    
    public Doctor agregarCitasDoctore(int id, Citas citas);

    public Pacientes agregarCitasPaciente(int id, Citas citas);
}
