package com.springframework.pet_clinic_app.services.map;

import com.springframework.pet_clinic_app.model.Pet;
import com.springframework.pet_clinic_app.services.CrudService;
import com.springframework.pet_clinic_app.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
    @Override
    public Pet save(Pet pet) {
        return super.save( pet);
    }
}
