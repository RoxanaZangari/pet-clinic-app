package com.springframework.pet_clinic_app.services.map;

import com.springframework.pet_clinic_app.model.Owner;
import com.springframework.pet_clinic_app.services.CrudService;
import org.yaml.snakeyaml.tokens.Token;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner owner) {
         super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
         super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }
}
