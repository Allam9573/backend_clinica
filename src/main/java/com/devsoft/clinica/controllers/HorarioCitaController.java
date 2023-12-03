package com.devsoft.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.HorarioCitas;
import com.devsoft.clinica.services.impl.HorarioCitasServiceImpl;

@RestController
@RequestMapping("/api/horario")
public class HorarioCitaController {
    
    @Autowired
    private HorarioCitasServiceImpl horarioCitasServiceImpl;

     @PostMapping("/agregar")
    public String agregarHorarioDoctor(@RequestParam(name="doctor_id") int id,
                                       @RequestBody HorarioCitas horarioCitas){{
        if(this.horarioCitasServiceImpl.agregarHorarioDoctor(id, horarioCitas) != null){
            return "Se ha agregado el horario al doctor con id: " + id;
        }

        return "No existe el doctor con id: " + id;
    }

    }
}
