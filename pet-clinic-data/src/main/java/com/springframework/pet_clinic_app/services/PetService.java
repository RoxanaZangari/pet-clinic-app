package com.springframework.pet_clinic_app.services;

import com.springframework.pet_clinic_app.model.Owner;
import com.springframework.pet_clinic_app.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
