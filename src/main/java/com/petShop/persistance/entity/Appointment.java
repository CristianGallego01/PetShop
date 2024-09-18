package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "citas")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_citas")
    private Integer id_appointment;

    @Column(name = "fecha_cita")
    private String dateAppoint;

    @Column (name ="hora")
    private String hour;
}
