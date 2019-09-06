package br.com.wolf.smc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@RequestMapping("/novo")
	public String novo() {
		return "cliente/CadastroCliente";
	}
	
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public String cadastrar(String nome) {
		System.out.println("Cadastrar ---->"+ nome);
		return "cliente/CadastroCliente";
	}
}
