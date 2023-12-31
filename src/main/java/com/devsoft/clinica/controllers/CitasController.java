package com.devsoft.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Sala;
import com.devsoft.clinica.services.impl.CitasServiceImpl;

@RestController
@RequestMapping("/api/citas")
public class CitasController {

    @Autowired
    private CitasServiceImpl citasServiceImpl;

    @PostMapping("/agregar/{idPaciente}/{idDoctor}/{idSala}")
    public ResponseEntity<String> agregarCita(
            @PathVariable int idPaciente,
            @PathVariable int idDoctor,
            @PathVariable int idSala) {

        try {
            citasServiceImpl.agregarCita(idPaciente, idDoctor, idSala);
            return ResponseEntity.ok("Cita agregada con éxito");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar la cita");
        }
    }

    @GetMapping("/listar")
    public List<Citas> listarCitas() {
        return citasServiceImpl.listarCitas();
    }

}
