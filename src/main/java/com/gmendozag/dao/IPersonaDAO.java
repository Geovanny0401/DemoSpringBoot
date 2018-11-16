package com.gmendozag.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmendozag.model.Persona;

public interface IPersonaDAO extends JpaRepository<Persona, Integer> {

}
