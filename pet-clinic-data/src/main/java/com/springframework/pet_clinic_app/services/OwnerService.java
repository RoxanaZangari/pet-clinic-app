package com.springframework.pet_clinic_app.services;

import com.springframework.pet_clinic_app.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
