package com.devsoft.clinica.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.models.HorarioCitas;
import com.devsoft.clinica.repositories.DoctorRepository;
import com.devsoft.clinica.repositories.HorarioCitasRepository;
import com.devsoft.clinica.services.HorarioCitasService;


@Service
public class HorarioCitasServiceImpl implements HorarioCitasService {

    @Autowired
    private HorarioCitasRepository horarioCitasRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public HorarioCitas crearHorarioCitas(HorarioCitas horarioCitas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearHorarioCitas'");
    }

    @Override
    public List<HorarioCitas> mostrarHorarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarHorarios'");
    }

    @Override
    public List<HorarioCitas> mostrarHorariosPorId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarHorariosPorId'");
    }

    @Override
    public Doctor agregarHorarioDoctor(int id, HorarioCitas horarioCitas) {
        Doctor doctorActualizar = this.buscarDoctor(id);

        if(doctorActualizar != null){
            horarioCitas.setDoctor(doctorActualizar);
            this.horarioCitasRepository.save(horarioCitas);
        }

        return doctorActualizar;
    }
    
    private Doctor buscarDoctor(int id){
       return this.doctorRepository.findById(id).get();
    }
    


}
