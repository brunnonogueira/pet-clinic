package com.nogueira4j.springframework.petclinic.repositories;

import com.nogueira4j.springframework.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
