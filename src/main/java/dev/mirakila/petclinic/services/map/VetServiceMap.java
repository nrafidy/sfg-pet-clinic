package dev.mirakila.petclinic.services.map;

import dev.mirakila.petclinic.model.Vet;
import dev.mirakila.petclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

}
