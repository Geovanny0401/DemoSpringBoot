package com.gmendozag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmendozag.model.Persona;
import com.gmendozag.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping(produces="application/json")
	public List<Persona> listar()
	{
		return service.listar();
	}
	
	@GetMapping(value="/{id}", produces = "application/json")
	public Persona listarPorId(@PathVariable("id") Integer id)
	{
		return service.ListarId(id);	
	}
	
	@PostMapping(produces="application/json", consumes="application/json")
	public Persona registrar(@RequestBody Persona persona)
	{
		return service.registrar(persona);
		
	}
	
	@PutMapping(produces="application/json", consumes="application/json")
	public Persona modificar(@RequestBody Persona persona)
	{
		return service.modificar(persona);
		
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id)
	{
		service.eliminar(id);
		
	}

}
