package com.jm.jpa.controller;

import com.jm.jpa.model.Persona;
import com.jm.jpa.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PersonaController
{
    @Autowired
    PersonaRepository personaRepository;

    public Persona save(Persona persona)
    {
        return personaRepository.save(persona);
    }

    public List<Persona> findAll(){
        return (List<Persona>) personaRepository.findAll();
    }

    public Persona find(Integer id)
    {
        return personaRepository.findById(id).orElse(null);
    }
}
