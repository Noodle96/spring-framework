package com.casaapuestasrussell.springboot.app.models.dao;

import java.util.List;

import com.casaapuestasrussell.springboot.app.models.entity.Cliente;

public interface IClienteDao {
	
	public List<Cliente> findAll();
}
