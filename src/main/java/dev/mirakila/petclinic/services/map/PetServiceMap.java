package dev.mirakila.petclinic.services.map;

import java.util.Set;
import dev.mirakila.petclinic.model.Pet;
import dev.mirakila.petclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

}
