package com.proyecto.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class variablesRutaController {
	
	@GetMapping("/")
	public String variables(Model modelo) {
		modelo.addAttribute("titulo", "multiples variables por ruta");
		//modelo.addAttribute("resultado", "variables");
		return "variables/indexVariables";
	}
	
	
	// para enviar solo un parametro: borrar paramsDos de la ruta y de los parametros de la funcion 
	@GetMapping("/string/{paramUno}/{paramDos}")
	public String variables(@PathVariable String paramUno, @PathVariable Integer paramDos, Model modelo) {
		modelo.addAttribute("resultado", " la variable por ruta:  " + paramUno + " el parametro 2: " + paramDos);
		return "variables/ver";
	}	
}
