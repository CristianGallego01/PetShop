package com.petShop.persistance.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="id_productos")
        private Integer id_product;

    @Column(name = "precio")
    private Double price;

    @Column(name = "nombre_producto")
    private String nameProduct;
}
