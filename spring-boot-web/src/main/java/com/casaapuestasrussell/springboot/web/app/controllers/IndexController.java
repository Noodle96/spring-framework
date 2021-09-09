package com.casaapuestasrussell.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	//http://localhost:8080/index
	//DEFAULT => GET
	@RequestMapping(value = {"/index","/","home"},method=RequestMethod.GET)
	//@GetMapping(value ="..")
	public String index() {
		
		//return name vista => index.html
		return "index";
	}
}
