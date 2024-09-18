package com.petShop.domain.repository;

import com.petShop.domain.PetDomain;

import java.util.List;
import java.util.Optional;

public interface PetDomainRepository {

    List<PetDomain> getAll();
    Optional<PetDomain> getPetById(int id);
    Optional<List<PetDomain>> getByName(String name);
    PetDomain save(PetDomain petDomain);
    void delete(int productId);
}
