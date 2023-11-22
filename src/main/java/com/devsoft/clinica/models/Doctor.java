package com.devsoft.clinica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "doctores")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @Column(name = "id_doctor")
    private Integer idDoctor;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String correo;

    @ManyToOne
    @JoinColumn(name = "especialidad", insertable = false, updatable = false)
    private Especialidad especialidad;

}
