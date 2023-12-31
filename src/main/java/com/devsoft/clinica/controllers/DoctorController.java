package com.devsoft.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.clinica.models.Citas;
import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.models.HorarioCitas;
import com.devsoft.clinica.services.impl.DoctorServiceImpl;
import com.devsoft.clinica.services.impl.EspecialidadServiceImpl;

@RestController
@RequestMapping("/api/doctores")
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorServiceImpl;

    @Autowired
    private EspecialidadServiceImpl especialidadServiceImpl;

    @PostMapping("/crear")
    public Doctor crearDoctor(@RequestBody Doctor doctor) {
        if (doctor.getCitas() != null) {
            for (Citas citas : doctor.getCitas()) {
                citas.setDoctor(doctor);
            }
        }

        if (doctor.getHorariocitas() != null) {
            for (HorarioCitas horarioCitas : doctor.getHorariocitas()) {
                horarioCitas.setDoctor(doctor);
            }
        }

        return this.doctorServiceImpl.crearDoctor(doctor);
    }

    @GetMapping("/listar")
    public List<Doctor> listarDoctores() {
        System.out.println(doctorServiceImpl.listarDoctores());
        return doctorServiceImpl.listarDoctores();
    }

    @PostMapping(value = "/agregar/{id_especialidad}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String agregarCuentaCliente(@PathVariable int id_especialidad,
            @RequestBody Doctor doctor) {
        {
            if (this.doctorServiceImpl.agregarDoctorEspecialidad(id_especialidad, doctor) != null) {
                return "Se ha agregado la cuenta al cliente: " + id_especialidad;
            }

            return "No existe el cliente con dni: " + id_especialidad;
        }

    }

    @GetMapping("/listar/{especialidad_id}")
    public List<Doctor> getDoctoresPorEspecialidad(@PathVariable int especialidad_id) {
        return doctorServiceImpl.getDoctoresEspecialidad(especialidad_id);
    }

    @GetMapping("/eliminar/{id}")
    public String eliminaDoctor(@PathVariable int id){
        return doctorServiceImpl.eliminarDoctorId(id);
    }

}
