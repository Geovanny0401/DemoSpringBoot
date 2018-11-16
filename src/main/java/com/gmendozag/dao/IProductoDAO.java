package com.gmendozag.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmendozag.model.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {

}
