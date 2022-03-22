package com.proyecto.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class inicioController {
	// llamada a las vistas
	
	// vista principal
	@GetMapping({"/","/index","/home"})
	public String inicio(Model modelo) {
		modelo.addAttribute("nombreParametro", "valor del parametro");
		return "index";
	}
}
