package dev.mirakila.petclinic.services.map;

import dev.mirakila.petclinic.services.CrudService;
import dev.mirakila.petclinic.model.Owner;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>
        implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
