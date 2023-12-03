package com.devsoft.clinica.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Pacientes;
import com.devsoft.clinica.services.impl.PacientesServiceImpl;

@RestController
@RequestMapping("/apis/paciente")
public class PacienteController {
    
    @Autowired
    private PacientesServiceImpl pacientesServiceImpl;

    @PostMapping("/crear")
    public Pacientes crearPacientes(@RequestBody Pacientes nvoPaciente){
        if(nvoPaciente.getCitas() != null){
            for (Citas citas : nvoPaciente.getCitas()) {
                citas.setPacientes(nvoPaciente);                
            }
        }

        return this.pacientesServiceImpl.crearPaciente(nvoPaciente);
    }

    @GetMapping("/listar")
    public List<Pacientes> listarPacientes(){
        return this.pacientesServiceImpl.listarPacientes();
    }

    @DeleteMapping("/eliminar")
    public String eliminarPaciente(@RequestParam(name = "paciente_id") int id){
        return this.pacientesServiceImpl.borrarPaciente(id);
    }

}
