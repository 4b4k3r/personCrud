package com.jm.jpa.api;

import com.jm.jpa.controller.PersonaController;
import com.jm.jpa.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaApi
{
    @Autowired
    PersonaController personaController;

    @PutMapping(path = "/person/new")
    @ResponseStatus(code = HttpStatus.OK)
    public Persona newPerson(@Validated  @RequestBody( required =  true ) Persona persona)
    {
        return personaController.save(persona);
    }

    @GetMapping(path = "/person/find/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Persona findAPerson(@PathVariable( required =  true, name = "id") Integer id)
    {
        return personaController.find(id);
    }

    @GetMapping(path = "/person/find")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Persona> findAllPersons()
    {
        return personaController.findAll();
    }
}
