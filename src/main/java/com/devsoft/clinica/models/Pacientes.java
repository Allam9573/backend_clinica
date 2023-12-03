package com.devsoft.clinica.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pacientes")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Pacientes {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paciente_id")
    @Id
    private int idPaciente;

    private String nombre;

    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private String direccion;

    private String telefono;

    @OneToMany(mappedBy = "pacientes", cascade = CascadeType.ALL)
    private List<Citas> citas = new ArrayList<>();

    @OneToOne(mappedBy = "pacientes")
    private HistorialCitas historialCitas;
}
