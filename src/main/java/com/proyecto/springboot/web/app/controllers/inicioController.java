package com.proyecto.springboot.web.app.controllers;
import java.util.ArrayList;
import java.util.List;

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
		usuario.setMail("userMail");
		modelo.addAttribute("usuario", usuario);
		modelo.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@GetMapping("/listar")
	public String listar(Model modelo) {
		List<UsuarioModel> usuarios = new ArrayList<>();
		usuarios.add(new UsuarioModel("nombre0","apellido0","mail0"));
		usuarios.add(new UsuarioModel("nombre1","apellido1","mail1"));
		modelo.addAttribute("titulo", "Listado de usuarios");
		modelo.addAttribute("usuarios", usuarios);
		return "listar";
	}
	
	/*
	 * tambien se puede usar el @modelAtributte("varName") para enviar datos.
	 * este generaliza el uso de la variable, cada vez que se use "varName" llamara a los datos que retorne.
	 */
}
