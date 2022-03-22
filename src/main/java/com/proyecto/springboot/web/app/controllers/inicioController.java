package com.proyecto.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")		// ruta de primer nivel, base para todos los elementos del controlador
public class inicioController {
	// llamada a las vistas
	
	// vista principal
	@GetMapping({"/index","/saludo"})
	public String inicio(Model modelo) {
		modelo.addAttribute("nombreParametro", "valor del parametro");
		return "index";
	}
}
