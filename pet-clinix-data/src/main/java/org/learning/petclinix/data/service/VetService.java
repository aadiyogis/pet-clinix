package org.learning.petclinix.data.service;

import org.learning.petclinix.data.model.Vet;

import java.util.Set;

public interface VetService {
    Vet save(Vet vet);
    Vet findById(Long id);
    Set<Vet> findAll();
}
