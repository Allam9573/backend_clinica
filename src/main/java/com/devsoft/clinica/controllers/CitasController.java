package com.devsoft.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Sala;
import com.devsoft.clinica.services.impl.CitasServiceImpl;

@RestController
@RequestMapping("/apis/citas")
public class CitasController {
    
    @Autowired
    private CitasServiceImpl citasServiceImpl;

    @PostMapping("/agregar")
    public String agregarCitaASala(@RequestParam(name = "sala_id") int id,
                                    @RequestBody Citas citas){
        if(this.citasServiceImpl.agregarCitaASala(id, citas) != null){
            return "Se ha agregado la cita a la sala con el id: " + id;
        }

        return "No existe la sala con el id: " + id;                       
    }

     @PostMapping("/agregar/doctor")
    public String agregarCitaDoc(@RequestParam(name = "doctor_id") int id,
                                    @RequestBody Citas citas){
        if(this.citasServiceImpl.agregarCitasDoctore(id, citas) != null){
            return "Se ha agregado la cita al doctor con el id: " + id;
        }

        return "No existe el Doctor con el id: " + id;                       
    }

    @PostMapping("/agregar/paciente")
    public String agregarCitaPaciente(@RequestParam(name = "paciente_id") int id,
                                    @RequestBody Citas citas){
        if(this.citasServiceImpl.agregarCitasPaciente(id, citas) != null){
            return "Se ha agregado la cita al paciente con id: " + id;
        }

        return "No existe el paciente con el id: " + id;                       
    }



}
