package org.learning.petclinix.data.repositories;

import org.learning.petclinix.data.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
