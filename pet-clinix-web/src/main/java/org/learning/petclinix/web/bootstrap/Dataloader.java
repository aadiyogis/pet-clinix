package org.learning.petclinix.web.bootstrap;

import org.learning.petclinix.data.model.Owner;
import org.learning.petclinix.data.model.PetType;
import org.learning.petclinix.data.model.Vet;
import org.learning.petclinix.data.service.OwnerService;
import org.learning.petclinix.data.service.PetTypeService;
import org.learning.petclinix.data.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;

    public Dataloader(VetService vetService, OwnerService ownerService, PetTypeService petTypeService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType cat = new PetType();
        cat.setName("cat");
        PetType catType = petTypeService.save(cat);

        PetType dog = new PetType();
        dog.setName("dog");
        PetType dogType = petTypeService.save(dog);

        Owner owner1 = new Owner();
        owner1.setFirstName("Aditya");
        owner1.setLastName("Ajmera");

        Owner owner2 = new Owner();
        owner2.setFirstName("Anika");
        owner2.setLastName("AJmera");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Loaded owners " + ownerService.findAll().size());

        Vet vet1 = new Vet();
        vet1.setFirstName("KING");
        vet1.setLastName("Richard");

        vetService.save(vet1);
        System.out.println("Loaded vets");

    }
}
