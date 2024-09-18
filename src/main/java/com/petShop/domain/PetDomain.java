package com.petShop.domain;

import lombok.Data;

@Data
public class PetDomain {
    private Integer id;
    private String name;
    private String species;
    private int age;
    private String gender;
    private OwnerDomain id_owner;
}
