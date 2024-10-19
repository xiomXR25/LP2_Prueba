package com.cibertec.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.app.models.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@GetMapping("/inicio")
	public String inicio() {
		return "/cliente/inicio";
	}
	
	@GetMapping("/formularioCliente")
	public String crear(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "/cliente/crearCliente";
	}
	
	@PostMapping("/GuardarCliente")
	public String crear(Cliente  cliente) {
		System.out.println("Codigo : " + cliente.getCodigo_cliente());
		System.out.println("Nombre : " + cliente.getNombre());
		System.out.println("Apellido Paterno : " + cliente.getApellidoPaterno());
		System.out.println("Apellido Materno : " + cliente.getApellidoMaterno());
		System.out.println("Documento : " + cliente.getDocumento());
		return "redirect:/cliente/formularioCliente";
	}
	
	
	
}
