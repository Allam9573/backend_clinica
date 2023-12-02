package com.devsoft.clinica.models;


import java.time.LocalDate;
import java.time.LocalTime;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "citas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Citas {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cita_id")
    @Id
    private int idCitas;

    @Column(name = "fecha_cita")
    private LocalDate fechaCita;

    @Column(name = "hora_cita")
    private LocalTime horaCita;

   

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Pacientes pacientes;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala salas;

    //  @ManyToOne
    // private HistorialCitas historialCitas;

   
   
}
