package dev.mirakila.petclinic.services;

import dev.mirakila.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
