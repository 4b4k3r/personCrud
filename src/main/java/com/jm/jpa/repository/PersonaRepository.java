package com.jm.jpa.repository;

import com.jm.jpa.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Integer>
{
    Persona save(Persona entity);
}
