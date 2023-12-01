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

import com.devsoft.clinica.models.Especialidad;
import com.devsoft.clinica.services.impl.EspecialidadServiceImpl;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadController {

    @Autowired
    private EspecialidadServiceImpl especialidadServiceImpl;

    @PostMapping("/crear")
    public Especialidad nuevaEspecialidad(@RequestBody Especialidad especialidad) {
        return especialidadServiceImpl.crearEspecialidad(especialidad);
    }

    @GetMapping("/listar")
    public List<Especialidad> listarEspecialidades() {
        return especialidadServiceImpl.listarEspecialidades();
    }

    @DeleteMapping("/eliminar")
    public String eliminar(@RequestParam int id) {
        return especialidadServiceImpl.eliminarEspecialidadPorId(id);
    }
}
