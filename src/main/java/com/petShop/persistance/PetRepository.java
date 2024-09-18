package com.petShop.persistance;

import com.petShop.domain.PetDomain;
import com.petShop.domain.repository.PetDomainRepository;
import com.petShop.persistance.crud.PetCrudRepository;
import com.petShop.persistance.entity.Pet;
import com.petShop.persistance.mapper.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository implements PetDomainRepository {
    private PetCrudRepository petCrudRepository;

    @Autowired
    private PetMapper mapper;

    @Override
    public List<PetDomain> getAll(){
        List<Pet> pets = (List<Pet>) petCrudRepository.findAll();
        return mapper.toPet(pets);
    }

    @Override
    public Optional<PetDomain> getPetById(int id) {
        return petCrudRepository.findById(id).map(Pet -> mapper.toPet(Pet));
    }

    @Override
    public PetDomain save(PetDomain petdomain) {
        Pet pet = mapper.toPet(petdomain);
        return mapper.toPet(petCrudRepository.save(pet));
    }

    public void delete(int id) {
        petCrudRepository.deleteById(id);
    }

    public List<Pet> getBySpecies(String species){
        return petCrudRepository.findBySpeciesOrderByIdAsc(species);
    }

    public boolean existsPet(int id){
        return petCrudRepository.existsById(id);
    }

    public long countAll(){
        return petCrudRepository.count();
    }
}

