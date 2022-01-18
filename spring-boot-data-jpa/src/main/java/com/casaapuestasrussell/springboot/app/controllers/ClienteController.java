 package com.casaapuestasrussell.springboot.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.casaapuestasrussell.springboot.app.models.dao.IClienteDao;
import com.casaapuestasrussell.springboot.app.models.entity.Cliente;


@Controller
public class ClienteController {
	
	@Autowired
	@Qualifier("clienteDaoJPA")
	private IClienteDao clienteDao;
	
	@RequestMapping(value ="listar",method=RequestMethod.GET)
	public String listar(Model model) {		
		model.addAttribute("titulo", "Listado de Clientes");
		model.addAttribute("clientes", clienteDao.findAll());
		return "listar";
	}
	
	@RequestMapping(value="/form")
	public String crear(Map<String, Object> model) {
		Cliente cliente = new Cliente();
		model.put("titulo", "Formulario del Cliente");
		model.put("cliente", cliente);
		return "form";
	}
	
	@RequestMapping(value="/form", method = RequestMethod.POST)
	public String guardar(Cliente cliente) {
		clienteDao.save(cliente);
		return "redirect:listar";
	}

}
