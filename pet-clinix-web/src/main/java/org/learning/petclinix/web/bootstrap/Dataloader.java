package org.learning.petclinix.web.bootstrap;

import org.learning.petclinix.data.model.*;
import org.learning.petclinix.data.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Dataloader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public Dataloader(VetService vetService, OwnerService ownerService,
                      PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
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
        owner1.setAddress("Gumasta nagar");
        owner1.setCity("Indore");
        owner1.setTelephone("1342341344");

        Pet dog1 = new Pet();
        dog1.setPetType(dogType);
        dog1.setName("Ruby");
        dog1.setBirthDate(LocalDate.now());
        dog1.setOwner(owner1);

        owner1.getPets().add(dog1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Anika");
        owner2.setAddress("Gumasta nagar");
        owner2.setCity("Indore");
        owner2.setTelephone("1342341344");
        owner2.setLastName("AJmera");

        Pet cat1 = new Pet();
        cat1.setPetType(catType);
        cat1.setOwner(owner2);
        cat1.setBirthDate(LocalDate.now());
        cat1.setName("Lucy");

        owner2.getPets().add(cat1);

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Loaded owners " + ownerService.findAll().size());

        Visit visit = new Visit();
        visit.setDate(LocalDate.now());
        visit.setPet(dog1);
        visit.setDescription("Hair issue");

        visitService.save(visit);

        System.out.println("visits are " + visitService.findAll().size());

        Speciality speciality = new Speciality();
        speciality.setDescription("Radiology");
        Speciality radiology = specialityService.save(speciality);

        Speciality speciality1 = new Speciality();
        speciality1.setDescription("surgery");
        Speciality surgery = specialityService.save(speciality1);

        Speciality speciality2 = new Speciality();
        speciality2.setDescription("Dentistry");
        Speciality dentistry = specialityService.save(speciality2);


        Vet vet1 = new Vet();
        vet1.setFirstName("KING");
        vet1.setLastName("Richard");
        vet1.getSpecialities().add(radiology);
        vet1.getSpecialities().add(surgery);

        vetService.save(vet1);
        System.out.println("Loaded vets");

    }
}
