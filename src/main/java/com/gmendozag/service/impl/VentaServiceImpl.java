package com.gmendozag.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmendozag.dao.IVentaDAO;
import com.gmendozag.model.Venta;
import com.gmendozag.service.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService {
	
	@Autowired
	private IVentaDAO dao;
	
	@Override
	public Venta registrar(Venta venta) {
		venta.getDetalleVenta().forEach(d->{
			d.setventa(venta);
		});
		return dao.save(venta);
	}

	@Override
	public Venta modificar(Venta t) {
		
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
		
	}

	@Override
	public List<Venta> listar() {
		
		return dao.findAll();
	}

	@Override
	public Venta ListarId(int id) {
		
		return dao.findOne(id);
	}

}
