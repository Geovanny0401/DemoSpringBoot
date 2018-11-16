package com.gmendozag.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmendozag.model.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer> {

}
