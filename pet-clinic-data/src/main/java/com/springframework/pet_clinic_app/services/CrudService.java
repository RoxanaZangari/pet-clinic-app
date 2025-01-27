package com.springframework.pet_clinic_app.services;

import java.util.Set;

public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);
    T save(T t);
    void delete(T t);
    void deleteById(ID id);

}
