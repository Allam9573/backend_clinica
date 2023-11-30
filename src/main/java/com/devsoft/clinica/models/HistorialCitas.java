package com.devsoft.clinica.models;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "historial_citas")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HistorialCitas {

    @Column(name = "historial_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idHistorial;

    private String diagnostico;

    private String tratamiento;

    @Column(name = "fecha_historial")
    private LocalDate fechaHistorial;

    // @OneToMany
    // @JoinColumn(name = "cita_id")
    // private List<Citas> citas;

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Pacientes pacientes;

    @OneToOne
    @JoinColumn(name = "cita_id")
    private Citas citas;
}
