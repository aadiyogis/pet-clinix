package org.learning.petclinix.data.repositories;

import org.learning.petclinix.data.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
