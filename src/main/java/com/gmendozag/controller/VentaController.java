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

import com.gmendozag.model.Venta;
import com.gmendozag.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	private IVentaService service;
	
	@GetMapping(produces = "application/json")
	public List<Venta> listar()
	{
		return service.listar();
		
	}
	
	@GetMapping(value="/{id}", produces = "application/json")
	public Venta listarPorId(@PathVariable("id") Integer id)
	{
		return service.ListarId(id);	
	}
	
	@PostMapping(produces="application/json", consumes="application/json")
	public Venta registrar(@RequestBody Venta venta)
	{
		return service.registrar(venta);
		
	}
	
	@PutMapping(produces="application/json", consumes="application/json")
	public Venta modificar(@RequestBody Venta venta)
	{
		return service.modificar(venta);
		
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id)
	{
		service.eliminar(id);
		
	}

}
