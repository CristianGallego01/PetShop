package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "propietarios")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column (name= "id_propietario")
    private Integer id_owner;

    @Column(name = "nombres_propietario")
    private String namesOwner;

    @Column(name = "apellidos")
    private String lastName;

    @Column (name = "correo")
    private String email;

    @Column (name = "telefono")
    private Integer number;

    @Column (name = "direccion")
    private String address;

    @OneToMany (mappedBy = "owner")
    private List<Pet> pets;
}
