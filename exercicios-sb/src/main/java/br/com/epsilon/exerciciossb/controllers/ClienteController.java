package br.com.epsilon.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.epsilon.exerciciossb.model.entities.Assento;
import br.com.epsilon.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente("Pedro", new Assento("15"));
	}
	
	@GetMapping("/{id}")
	public Cliente ObterClientePorId1(@PathVariable int id) {
		return new Cliente("Maria", new Assento("16"));
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente("João Augusto", new Assento("11"));
	}
	
}