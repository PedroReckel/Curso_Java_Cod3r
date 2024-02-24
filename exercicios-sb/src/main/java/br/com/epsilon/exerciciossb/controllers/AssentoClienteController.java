package br.com.epsilon.exerciciossb.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.epsilon.exerciciossb.model.entities.Cliente;
import br.com.epsilon.exerciciossb.model.repositories.AssentoClienteRepository;
import br.com.epsilon.exerciciossb.model.repositories.ClienteDTO;

@RestController
@RequestMapping("api/assentoCliente")
public class AssentoClienteController {

	@Autowired
	private AssentoClienteRepository assentoClienteRepository;
	
	@RequestMapping(path="/cadastraCliente/" , method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Cliente salvarCliente(@Valid Cliente cliente) {
		assentoClienteRepository.save(cliente);
		return cliente;
	}
	
	@GetMapping(path="/nomeCliente/{parteNome}")
	public List<ClienteDTO>  obterClientePorNome(@PathVariable String parteNome) {
		List<Cliente> clientes = (List<Cliente>) assentoClienteRepository.findByNomeContainingIgnoreCase(parteNome);
		
		return clientes
			   .stream()
			   .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getAssento().getId()))
			   .collect(Collectors.toList());
	}
	
	@GetMapping(path = "/clientes/pagina/{numeroPagina}/{qtdePagina}")
	public List<ClienteDTO> obterClientesPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
		if(qtdePagina >= 5) qtdePagina = 5;
		PageRequest page = PageRequest.of(numeroPagina, qtdePagina);
		Page<Cliente> clientes = assentoClienteRepository.findAllClienteNotDeleted(page);
		
		return clientes
			   .stream()
			   .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getAssento().getId()))
			   .collect(Collectors.toList());
	}

	@GetMapping(path = "/assentos/pagina/{numeroPagina}/{qtdePagina}")
	public Page<Cliente> obterAssentosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
		if(qtdePagina >= 5) qtdePagina = 5;
		PageRequest page = PageRequest.of(numeroPagina, qtdePagina);
		return assentoClienteRepository.findAllAssentoNotDeleted(page);
	}
	

	
}