package br.com.epsilon.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

//	@RequestMapping(method = RequestMethod.GET, path = "/ola") // Se eu deixar em branco ele pega o GET como padrão 
	@GetMapping(path = { "/ola", "/saudacao" }) // Forma mais simplificada
	public String ola() {
		return "Olá Spring Boot!";
	}

//	@PostMapping(path = "/saudacao") // Forma mais simplificada
//	public String saudacao() {
//		return "Olá Spring Boot (POST)!";
//	}
	
}