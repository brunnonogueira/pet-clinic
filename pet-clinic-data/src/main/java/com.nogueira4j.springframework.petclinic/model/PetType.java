package com.nogueira4j.springframework.petclinic.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PetType extends BaseEntity {

    private String name;

    @Override
    public String toString() {
        return name;
    }
}