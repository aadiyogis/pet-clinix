package org.learning.petclinix.data.repositories;

import org.learning.petclinix.data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
