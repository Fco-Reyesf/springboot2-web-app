package com.proyecto.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.springboot.web.app.models.UsuarioModel;

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
	
	
	@GetMapping("/perfil")
	public String perfil(Model modelo) {
		UsuarioModel usuario = new UsuarioModel();
		usuario.setNombre("Username");
		usuario.setApellido("UserLastName");
		modelo.addAttribute("usuario", usuario);
		modelo.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
}
