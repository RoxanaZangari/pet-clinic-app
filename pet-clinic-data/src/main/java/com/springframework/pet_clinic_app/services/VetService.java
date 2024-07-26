package com.springframework.pet_clinic_app.services;

import com.springframework.pet_clinic_app.model.Owner;
import com.springframework.pet_clinic_app.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
