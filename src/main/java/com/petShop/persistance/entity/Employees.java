package com.petShop.persistance.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "empleados")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_employee;

    @Column(name = "nombre_empleado")
    private String nameEmployee;

    @Column(name = "apellido_empleado")
    private String lastNameEmployee;

    @Column (name = "cargo")
    private String position;
}
