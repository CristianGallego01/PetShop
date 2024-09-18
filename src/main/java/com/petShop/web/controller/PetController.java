package com.petShop.web.controller;


import com.petShop.domain.PetDomain;
import com.petShop.domain.service.petService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private petService petService;

    @GetMapping("/all")
    public List<PetDomain> getAll() {
        return petService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<List<PetDomain>> getPetById(@PathVariable("id") int id) {
        return petService.getPetById(id);
    }

    @GetMapping("/{name}")
    public Optional<List<PetDomain>> getByCategory(@PathVariable("name")String name) {
        return petService.getByName(name);
    }
}
