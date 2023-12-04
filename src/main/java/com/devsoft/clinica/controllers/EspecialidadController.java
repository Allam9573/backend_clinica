package com.devsoft.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity<List<Especialidad>> listarEspecialidades() {
        List<Especialidad> especialidades = especialidadServiceImpl.listarEspecialidades();
        return ResponseEntity.ok(especialidades);
    }

    @DeleteMapping("/eliminar")
    public String eliminar(@RequestParam int id) {
        return especialidadServiceImpl.eliminarEspecialidadPorId(id);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Especialidad> buscarEspecialidad(@PathVariable int id) {
        Especialidad buscarEspecialidad = especialidadServiceImpl.buscarEspecialidad(id);
        return ResponseEntity.ok(buscarEspecialidad);
    }

    @PutMapping("/editar/{id}")
    public Especialidad editarEspecialidad(@PathVariable int id, @RequestBody Especialidad especialidad) {
        return especialidadServiceImpl.actualizarEspecialidad(id, especialidad);
    }

}
