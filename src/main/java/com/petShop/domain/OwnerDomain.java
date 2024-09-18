package com.petShop.domain;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class OwnerDomain {

    private Integer id_owner;
    private String namesOwner;
    private String lastName;
    private String email;
    private Integer number;
    private String address;

}
