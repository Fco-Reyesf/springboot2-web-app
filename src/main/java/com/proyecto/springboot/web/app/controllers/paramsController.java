package com.proyecto.springboot.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class paramsController {

	@GetMapping("/")
	public String index(){
		return "params/index";
	}
	
	
	@GetMapping("/string")
	public String param(@RequestParam(required = false) String texto , Model modelo){
		modelo.addAttribute("resultado", "El parametro es: " + texto);
		return "params/ver";
	}
	
	@GetMapping("/varios-params")
	public String param(@RequestParam(required = false) String paramUno, @RequestParam(required = false) Integer paramDos , Model modelo){
		modelo.addAttribute("resultado", "El parametro uno es: " + paramUno + " el parametro es: " + paramDos);
		return "params/ver";
	}
	
	
	@GetMapping("/varios-params-request")
	public String param(HttpServletRequest request , Model modelo){
		try {
			String paramUno = request.getParameter("paramUno");
			Integer paramDos = Integer.parseInt(request.getParameter("paramDos"));
		modelo.addAttribute("resultado", "El parametro uno es: " + paramUno + " el parametro es: " + paramDos);
		} catch (NumberFormatException e) {}
		return "params/ver";
	}
}
