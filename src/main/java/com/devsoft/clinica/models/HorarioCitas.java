package com.devsoft.clinica.models;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "horario_citas")
public class HorarioCitas {
    

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "horario_id")
    @Id
    private int idHorario;

    @Column(name = "dia_semana")
    private String dia;

    @Column(name = "hora_inicio")
    private LocalTime horaInicio;

    @Column(name = "hora_fin")
    private LocalTime horaFin;

    @JoinColumn(name = "doctor_id")
    private Doctor doctores;
}
