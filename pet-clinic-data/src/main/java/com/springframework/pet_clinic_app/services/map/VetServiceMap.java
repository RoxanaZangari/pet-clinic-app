package com.springframework.pet_clinic_app.services.map;

import com.springframework.pet_clinic_app.model.Vet;
import com.springframework.pet_clinic_app.services.CrudService;
import com.springframework.pet_clinic_app.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
