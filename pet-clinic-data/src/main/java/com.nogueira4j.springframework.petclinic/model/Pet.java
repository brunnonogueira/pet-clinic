package com.nogueira4j.springframework.petclinic.model;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pet extends BaseEntity{

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}