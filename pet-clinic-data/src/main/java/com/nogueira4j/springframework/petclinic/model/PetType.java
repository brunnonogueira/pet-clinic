package com.nogueira4j.springframework.petclinic.model;

import lombok.*;

public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}