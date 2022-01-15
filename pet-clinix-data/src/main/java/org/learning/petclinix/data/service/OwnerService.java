package org.learning.petclinix.data.service;

import org.learning.petclinix.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
