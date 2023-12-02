package com.devsoft.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.Sala;
import com.devsoft.clinica.services.impl.SalaServiceImpl;

@RestController
@RequestMapping("/api/salas")
public class SalaController {

    @Autowired
    private SalaServiceImpl salaServiceImpl;

    @GetMapping("/listar")
    public List<Sala> listarSalas() {
        return this.salaServiceImpl.listarSalas();
    }

}
