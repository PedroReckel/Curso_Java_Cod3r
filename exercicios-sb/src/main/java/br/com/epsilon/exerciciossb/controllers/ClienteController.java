package br.com.epsilon.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.epsilon.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(1, "Pedro", "123.456.789-10");
	}
	
	@GetMapping("/{id}")
	public Cliente ObterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "109.876.543-21");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "João Augusto", "111.222.333-44");
	}
	
}