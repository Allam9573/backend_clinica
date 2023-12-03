package com.devsoft.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Sala;
import com.devsoft.clinica.services.impl.SalaServiceImpl;

@RestController
@RequestMapping("/api/salas")
public class SalaController {

    @Autowired
    private SalaServiceImpl salaServiceImpl;

    @GetMapping("/listar")
    public ResponseEntity<List<Sala>> listarSalas() {
        List<Sala> listaSalas = this.salaServiceImpl.listarSalas();
        return ResponseEntity.ok(listaSalas);
    }

    @PostMapping("/crear")
    public Sala crearSala(@RequestBody Sala nuevaSala) {
        if (nuevaSala.getCitas() != null) {
            for (Citas citas : nuevaSala.getCitas()) {
                citas.setSalas(nuevaSala);
            }
        }

        return this.salaServiceImpl.crearSala(nuevaSala);
    }

    @GetMapping("/eliminar")
    public String eliminarSala(@RequestParam(name = "sala_id") int id) {
        return this.salaServiceImpl.eliminarSala(id);

    }

}
