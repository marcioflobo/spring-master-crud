package br.com.wolf.smc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String novo() {
		System.out.println("Cheguei Aqui");
		return "index";
	}
}
