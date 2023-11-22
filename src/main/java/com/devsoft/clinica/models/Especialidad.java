package com.devsoft.clinica.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "especialidades")
@Setter
@Getter
public class Especialidad {

    @Id
    @Column(name = "id_especialidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEspecialidad;
    private String nombre;

    @OneToMany(mappedBy = "especialidad")
    private List<Doctor> doctores;

}
