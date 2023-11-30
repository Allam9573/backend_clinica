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
@Table(name = "salas")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Salas {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "sala_id")
    @Id
    private int idSala;

    @Column(name = "nombre")
    private String nombreSala;

    private String descripcion;

    @OneToMany(mappedBy = "salas", cascade = CascadeType.ALL)
    private List<Citas> citas;

    
}
