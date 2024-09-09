package com.crud.demo_crud.infraestructure.controller;

import org.springframework.web.bind.annotation.RestController;

import com.crud.demo_crud.domain.entity.Persona;
import com.crud.demo_crud.domain.entity.PersonaDTO;
import com.crud.demo_crud.domain.service.IPersona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
//@RequestMapping("/chapter")
public class PersonaController {

    @Autowired
    IPersona personaService;

    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersona() {
        return personaService.listarPersona();
    }

    @PostMapping("/persona")
    @ResponseBody
    public Persona crearPersona(@RequestBody Persona persona) {   
        return personaService.crearPersona(persona);
    }
    
    @DeleteMapping("/persona/{id}")
    @ResponseBody
    public void borrarPersona(@PathVariable Long id) {   
        personaService.borrarPersona(id);
    }

    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona buscarPersonaPorId(@PathVariable Long id) {   
        return personaService.buscarPersonaPorId(id);
    }

    @PutMapping("/persona/{id}")
    @ResponseBody
    public Persona editarPersona(@RequestBody Persona persona) {
        return personaService.editarPersona(persona);
    }

    //Para uso de query
    @PostMapping("/persona/login")
    public PersonaDTO login(@RequestBody Persona persona) {
        return personaService.login(persona.getUsuario(), persona.getContraseña());
    }
    
}
