package org.learning.petclinix.data.repositories;

import org.learning.petclinix.data.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
