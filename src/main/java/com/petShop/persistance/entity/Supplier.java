package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "proveedor")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_proveedor")
    private Integer idSupplier;

    @Column(name="nombre_proveedor")
    private String nameSupplier;

    @Column(name= "direccion_proveedor")
    private String addressSupplier;

    @Column(name = "telefono_proveedor")
    private Integer numberSupplier;

}
