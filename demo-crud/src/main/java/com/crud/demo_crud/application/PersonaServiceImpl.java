package com.crud.demo_crud.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo_crud.domain.entity.Persona;
import com.crud.demo_crud.domain.entity.PersonaDTO;
import com.crud.demo_crud.domain.service.IPersona;
import com.crud.demo_crud.infraestructure.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements IPersona {
    @Autowired PersonaRepository personaRepository;

    @Override
    public List<Persona> listarPersona() {
        return personaRepository.findAll();
    }

    @Override
    public Persona buscarPersonaPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public void borrarPersonaPorId(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona editarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public PersonaDTO login(String usuario, String contraseña) {
        Persona persona = personaRepository.findByUsuarioAndContraseña(usuario, contraseña);
        PersonaDTO personaDTO = new PersonaDTO(persona.getId(), persona.getUbicacion(), persona.getPosition(), persona.getFullName(), persona.getImage());
        return personaDTO;
    }

}
