package com.nogueira4j.springframework.petclinic.repositories;

import com.nogueira4j.springframework.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
