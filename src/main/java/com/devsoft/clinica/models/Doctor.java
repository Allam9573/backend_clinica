package com.devsoft.clinica.models;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
    private Integer idDoctor;

    private String nombre;
    
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "especialidad_id", insertable = false, updatable = false)
    private Especialidad especialidad;


    @OneToOne(mappedBy = "doctor", cascade = CascadeType.ALL)
    private HorarioCitas horariocitas;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Citas> citas;

}
