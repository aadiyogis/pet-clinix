package org.learning.petclinix.data.service;

import org.learning.petclinix.data.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
