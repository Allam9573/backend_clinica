package com.devsoft.clinica.models;



import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
    @Column(name = "doctor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDoctor;

    private String nombre;
    
    private String apellido;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad;

   
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<HorarioCitas> horariocitas= new ArrayList<>();

    
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Citas> citas = new ArrayList<>();

}
