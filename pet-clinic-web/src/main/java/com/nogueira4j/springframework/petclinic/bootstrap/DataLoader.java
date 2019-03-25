package com.nogueira4j.springframework.petclinic.bootstrap;

import com.nogueira4j.springframework.petclinic.model.Owner;
import com.nogueira4j.springframework.petclinic.model.PetType;
import com.nogueira4j.springframework.petclinic.model.Vet;
import com.nogueira4j.springframework.petclinic.services.OwnerService;
import com.nogueira4j.springframework.petclinic.services.PetTypeService;
import com.nogueira4j.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("GLamuor");

        ownerService.save(owner2);

        System.out.println("Loaded Owners.............");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Jim");
        vet2.setLastName("Gordon");

        vetService.save(vet2);

        System.out.println("Loaded Vets.............");
    }
}
