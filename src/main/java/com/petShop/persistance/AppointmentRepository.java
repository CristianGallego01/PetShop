package com.petShop.persistance;

import com.petShop.persistance.crud.AppointmentCrudRepository;
import com.petShop.persistance.entity.Appointment;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public class AppointmentRepository {
    private AppointmentCrudRepository appointmentCrudRepository;

    public List<Appointment> getAll(){
        return (List<Appointment>) appointmentCrudRepository.findAll();
    }

    public Optional<Appointment> getAppointmentById(int id) {
        return appointmentCrudRepository.findById(id);
    }

    public Appointment save(Appointment appointment) {
        return appointmentCrudRepository.save(appointment);
    }

    public void delete(int id_appointment) {
        appointmentCrudRepository.deleteById(id_appointment);
    }
    public boolean existsAppointment(int id_appointment){
        return appointmentCrudRepository.existsById(id_appointment);
    }

    public long countAll(){
        return appointmentCrudRepository.count();
    }
}
