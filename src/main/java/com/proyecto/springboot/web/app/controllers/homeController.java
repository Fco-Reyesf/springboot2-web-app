package com.proyecto.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// clase para redirigir a otros lados.
@Controller
public class homeController {
	
	@GetMapping("/")
	public String home() {
		// return "redirect:/home/index";					// cambia la ruta cuando redirige.
		return "forward:/home/index";                      // no cambia la ruta cuando redirige, solo funciona local.
		// return "redirect:https://www.google.com/";      // redirigir a otra pagina.
	}
}
