package com.devsoft.clinica.services;

import java.util.List;

import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.models.HorarioCitas;

public interface HorarioCitasService {

    public HorarioCitas crearHorarioCitas(HorarioCitas horarioCitas);

    public List<HorarioCitas> mostrarHorarios();

    public List<HorarioCitas> mostrarHorariosPorId(int id);

    public Doctor agregarHorarioDoctor(int id, HorarioCitas horarioCitas);
    
}
