package com.casaapuestasrussell.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.casaapuestasrussell.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	//http://localhost:8080/index
	//DEFAULT => GET
	@RequestMapping(value = {"/index","/","","home"},method=RequestMethod.GET)
	//@GetMapping(value ="..")
	public String index(Model model) {//(ModelMap model) or (Map<String,Object> map) or (ModelAndView mv)
		//mv.addObject("tiutlo","hola ...");
		//mv.setViewName("index");
		//return mv;
		//map.put("titulo","hola ...");
		model.addAttribute("titulo", "Titulo_Spring boot");
		//return name vista => index.html
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Russell");
		usuario.setApellido("Tito");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del Usuario ".concat(usuario.getNombre()));
		return "perfil";
	}
}
