package com.petShop.persistance;

import com.petShop.persistance.crud.OwnerCrudRepository;
import com.petShop.persistance.entity.Owner;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OwnerRepository {
    private OwnerCrudRepository ownerCrudRepository;

    public List<Owner> getAll(){
        return (List<Owner>) ownerCrudRepository.findAll();
    }

    public Optional<Owner> getOwnerById(int id_owner) {
        return ownerCrudRepository.findById(id_owner);
    }

    public Owner save(Owner owner) {
        return ownerCrudRepository.save(owner);
    }

    public void delete(int id_owner) {
        ownerCrudRepository.deleteById(id_owner);
    }
    public boolean existsOwner(int id_owner){
        return ownerCrudRepository.existsById(id_owner);
    }

    public long countAll(){
        return ownerCrudRepository.count();
    }
}
