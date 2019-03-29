package com.nogueira4j.springframework.petclinic.repositories;

import com.nogueira4j.springframework.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {

}
