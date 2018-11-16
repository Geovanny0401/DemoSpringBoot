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

import com.gmendozag.model.Producto;
import com.gmendozag.service.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	@GetMapping(produces="application/json")
	public List<Producto> listar()
	{
		return service.listar();
	}
	
	@GetMapping(value="/{id}", produces = "application/json")
	public Producto listarPorId(@PathVariable("id") Integer id)
	{
		return service.ListarId(id);	
	}
	
	@PostMapping(produces="application/json", consumes="application/json")
	public Producto registrar(@RequestBody Producto producto)
	{
		return service.registrar(producto);
		
	}
	
	@PutMapping(produces="application/json", consumes="application/json")
	public Producto modificar(@RequestBody Producto producto)
	{
		return service.modificar(producto);
		
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id)
	{
		service.eliminar(id);
		
	}

}
