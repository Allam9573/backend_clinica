package com.devsoft.clinica.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.clinica.models.Doctor;
import com.devsoft.clinica.models.Especialidad;
import com.devsoft.clinica.repositories.DoctorRepository;
import com.devsoft.clinica.repositories.EspecialidadRepository;
import com.devsoft.clinica.services.DoctorService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DoctorServiceImpl implements DoctorService {
    
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public Doctor crearDoctor(Doctor doctor) {
        return this.doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> listarDoctores() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor busDoctorId(int id) {
        return doctorRepository.findById(id).get();
    }

    @Override
    public String eliminarDoctorId(int id) {
        Doctor doctorEliminar = this.doctorRepository.findById(id).get();

        if(doctorEliminar != null){
            this.doctorRepository.delete(doctorEliminar);
            return "Se ha eliminado el cliente: " + doctorEliminar.getIdDoctor(); 
        }

        return "No existe el cliente con dni: " + id;
    }

    // @Override
    // public void agregarDoctorAEspecialidad(int id, Doctor doctor) {
    //      Especialidad especialidadAgregar =this.buscarEspecialidad(id);
            
    //      if(especialidadAgregar != null){
    //          // Asociar el doctor con la especialidad
    //     doctor.setEspecialidad(especialidadAgregar);

    //     // Agregar el doctor a la lista de doctores de la especialidad
    //     especialidadAgregar.getDoctores().add(doctor);

    //     // Guardar el doctor y la especialidad en la base de datos
    //     doctorRepository.save(doctor);
    //     especialidadRepository.save(especialidadAgregar);
    // }
    //      }

       




    @Override
    public Especialidad agregarDoctorEspecialidad(int id, Doctor doctor) {
        Especialidad especialidadAgregar =this.buscarEspecialidad(id);
        if(especialidadAgregar != null){
            doctor.setEspecialidad(especialidadAgregar);
            especialidadAgregar.getDoctores().add(doctor);
             

            this.doctorRepository.save(doctor);
            especialidadRepository.save(especialidadAgregar);
        }

        return especialidadAgregar;
    }

    private Especialidad buscarEspecialidad(int id){
        return this.especialidadRepository.findById(id).get();
    }

}
