package com.nogueira4j.springframework.petclinic.services;

import com.nogueira4j.springframework.petclinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}