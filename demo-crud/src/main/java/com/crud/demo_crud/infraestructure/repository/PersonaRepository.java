package com.crud.demo_crud.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo_crud.domain.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

    public Persona findByUsuarioAndContraseña(String usuario, String contraseña);
}
