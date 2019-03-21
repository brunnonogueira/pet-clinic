package com.nogueira4j.springframework.petclinic.repositories;

import com.nogueira4j.springframework.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
