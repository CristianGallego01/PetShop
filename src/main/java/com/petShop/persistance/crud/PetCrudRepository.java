package com.petShop.persistance.crud;

import com.petShop.persistance.entity.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetCrudRepository extends CrudRepository<Pet,Integer> {

    List<Pet> findBySpeciesOrderByIdAsc (String species);


}
