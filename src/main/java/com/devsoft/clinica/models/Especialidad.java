package com.devsoft.clinica.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "especialidades")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Especialidad {

   
    @Column(name = "especialidad_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idEspecialidad;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Doctor> doctores;

}
