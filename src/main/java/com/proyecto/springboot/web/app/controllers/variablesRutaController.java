package com.proyecto.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class variablesRutaController {

	@GetMapping("/string/{paramUno}")
	public String variables(@PathVariable String paramUno, Model modelo) {
		modelo.addAttribute("resultado", " la variable por ruta:  " + paramUno);
		return "variables/ver";
	}	
}
