package org.learning.petclinix.data.service;

import org.learning.petclinix.data.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Set<Owner> findAll();
    Owner save(Owner owner);
    Owner findByLastName(String lastName);
}
