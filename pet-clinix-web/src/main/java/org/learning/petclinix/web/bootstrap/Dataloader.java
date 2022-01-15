package org.learning.petclinix.web.bootstrap;

import org.learning.petclinix.data.model.Owner;
import org.learning.petclinix.data.model.Vet;
import org.learning.petclinix.data.service.OwnerService;
import org.learning.petclinix.data.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;

    public Dataloader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Aditya");
        owner1.setLastName("Ajmera");
        owner1.setId(1L);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Anika");
        owner2.setLastName("AJmera");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Loaded owners " + ownerService.findAll().size());

        Vet vet1 = new Vet();
        vet1.setFirstName("KING");
        vet1.setLastName("Richard");
        vet1.setId(3L);

        vetService.save(vet1);
        System.out.println("Loaded vets");

    }
}
