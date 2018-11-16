package com.gmendozag.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmendozag.dao.IPersonaDAO;
import com.gmendozag.model.Persona;
import com.gmendozag.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDAO dao;
	
	@Override
	public Persona registrar(Persona t) {
		
		return dao.save(t);
	}

	@Override
	public Persona modificar(Persona t) {
		
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
		
	}

	@Override
	public List<Persona> listar() {
		
		return dao.findAll();
	}

	@Override
	public Persona ListarId(int id) {
		
		return dao.findOne(id);
	}

}
