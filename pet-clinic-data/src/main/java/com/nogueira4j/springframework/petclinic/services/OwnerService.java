package com.nogueira4j.springframework.petclinic.services;

import com.nogueira4j.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}