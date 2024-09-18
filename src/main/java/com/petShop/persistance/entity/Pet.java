package com.petShop.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mascotas")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "especie")
    private String species;

    @Column (name = "edad")
    private int age;

    @Column (name = "genero")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Owner owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

}
