package com.nogueira4j.springframework.petclinic.model;

import java.util.Set;

public class Vet extends Person {

    private Set<Speaclity> specialities;

    public Set<Speaclity> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speaclity> specialities) {
        this.specialities = specialities;
    }
}