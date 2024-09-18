package com.petShop.domain.dto;


import lombok.Data;

@Data
public class PetDTO {

    private Integer id;
    private String name;
    private String species;
    private int age;
    private String gender;
    private Integer id_owner;
}
