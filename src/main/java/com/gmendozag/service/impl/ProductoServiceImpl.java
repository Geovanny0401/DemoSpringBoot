package com.gmendozag.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmendozag.dao.IProductoDAO;
import com.gmendozag.model.Producto;
import com.gmendozag.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoDAO dao;
	
	@Override
	public Producto registrar(Producto t) {
		
		return dao.save(t);
	}

	@Override
	public Producto modificar(Producto t) {
		
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
          dao.delete(id);
		
	}

	@Override
	public List<Producto> listar() {
		
		return dao.findAll();
	}

	@Override
	public Producto ListarId(int id) {
		
		return dao.findOne(id);
	}

}
