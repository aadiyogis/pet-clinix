package org.learning.petclinix.data.repositories;

import org.learning.petclinix.data.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
