package org.learning.petclinix.data.repositories;

import org.learning.petclinix.data.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
