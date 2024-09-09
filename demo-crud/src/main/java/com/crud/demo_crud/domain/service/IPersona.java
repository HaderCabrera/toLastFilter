package com.crud.demo_crud.domain.service;

import java.util.List;

import com.crud.demo_crud.domain.entity.Persona;
import com.crud.demo_crud.domain.entity.PersonaDTO;

public interface IPersona {

    List<Persona> listarPersona();
    Persona buscarPersonaPorId(Long id);
    Persona crearPersona(Persona persona);
    void borrarPersona(Long id);
    void borrarPersonaPorId(Long id);
    Persona editarPersona(Persona persona);
    PersonaDTO login(String usuario, String contraseña);
    
}
