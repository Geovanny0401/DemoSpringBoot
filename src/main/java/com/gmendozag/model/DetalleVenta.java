package com.gmendozag.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="detalle_venta")
public class DetalleVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalleVenta;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_venta", nullable=false)
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name="id_producto")
	private Producto producto;
	
	@Column(name="cantidad")
	private int cantidad;
	
	public int getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(int idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Venta getventa() {
		return venta;
	}

	public void setventa(Venta venta) {
		this.venta = venta;
	}

	public Producto getproducto() {
		return producto;
	}

	public void setproducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	
	
	
}
