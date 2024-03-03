package br.com.epsilon.exerciciossb.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.epsilon.exerciciossb.model.entities.Assento;
import br.com.epsilon.exerciciossb.model.entities.Cliente;
import br.com.epsilon.exerciciossb.model.repositories.ApiResponse;
import br.com.epsilon.exerciciossb.model.repositories.AssentoRepository;
import br.com.epsilon.exerciciossb.model.repositories.ClienteDTO;
import br.com.epsilon.exerciciossb.model.repositories.ClienteRepository;

@RestController
@RequestMapping("api/assentoCliente")
public class AssentoClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private AssentoRepository assentoRepository;
	
	@RequestMapping(path="/cadastrarCliente/" , method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Cliente salvarCliente(@Valid Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}
	
	@GetMapping(path="/nomeCliente/{parteNome}")
	public List<ClienteDTO>  obterClientePorNome(@PathVariable String parteNome) {
		List<Cliente> clientes = (List<Cliente>) clienteRepository.findByNomeContainingIgnoreCase(parteNome);
		
		return clientes
			   .stream()
			   .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getAssento().getId()))
			   .collect(Collectors.toList());
	}
	
	@GetMapping(path = "/clientes/pagina/{numeroPagina}/{qtdePagina}")
	public List<ClienteDTO> obterClientesPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
		if(qtdePagina >= 5) qtdePagina = 5;
		PageRequest page = PageRequest.of(numeroPagina, qtdePagina);
		Page<Cliente> clientes = clienteRepository.findAllClienteNotDeleted(page);
		
		return clientes
			   .stream()
			   .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getAssento().getId()))
			   .collect(Collectors.toList());
	}

	@GetMapping(path = "/assentos/pagina/{numeroPagina}/{qtdePagina}")
	public Page<Cliente> obterAssentosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
		if(qtdePagina >= 5) qtdePagina = 5;
		PageRequest page = PageRequest.of(numeroPagina, qtdePagina);
		return clienteRepository.findAllAssentoNotDeleted(page);
	}
	
	@GetMapping(path = "cliente/{id}")
	public ResponseEntity<Cliente> obterProdutoPorId(@PathVariable long id) {
		Optional<Cliente> clienteOptional = clienteRepository.findClienteByIdAndDeletedFalse(id);
		
		return clienteOptional.map(produto -> ResponseEntity.ok().body(produto))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	@GetMapping(path = "assento/{id}")
	public ResponseEntity<Assento> obterAssentoPorId(@PathVariable long id) {
		Optional<Assento> assentoOptional = assentoRepository.findAssentoByIdAndDeletedFalse(id);
		
		return assentoOptional.map(assento -> ResponseEntity.ok().body(assento))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@RequestMapping(path = "/excluirCliente/{id}", method = {RequestMethod.PUT})
	public ResponseEntity<ApiResponse> excluirCliente(@PathVariable Long id) {
		Cliente cliente = clienteRepository.findById(id).orElse(null);
		
		try {
			if(cliente != null) {
				cliente.setDeleted(true);
				clienteRepository.save(cliente);
				return ResponseEntity.ok(new ApiResponse(true, "Cliente " + id + " deletado com sucesso"));
			}
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(false, "Cliente não encontrado"));
	}

	@RequestMapping(path = "/recuperarCliente/{id}", method = {RequestMethod.PUT})
	public ResponseEntity<ApiResponse> recuperarCliente(@PathVariable Long id) {
		Cliente cliente = clienteRepository.findById(id).orElse(null);
		
		try {
			if(cliente != null) {
				cliente.setDeleted(false);
				clienteRepository.save(cliente);
				return ResponseEntity.ok(new ApiResponse(true, "Cliente " + id + " recuperado com sucesso"));
			}
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(false, "Cliente não encontrado"));
	}
	
	@RequestMapping(path = "/excluirAssento/{id}", method = {RequestMethod.PUT})
	public ResponseEntity<ApiResponse> excluirAssento(@PathVariable Long id) {
		Assento assento = assentoRepository.findById(id).orElse(null);
		
		try {
			if(assento != null) {
				assento.setDeleted(true);
				clienteRepository.save(assento);
				return ResponseEntity.ok(new ApiResponse(true, "Assento " + id + " deletado com sucesso"));
			}
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(false, "Assento não encontrado"));
	}

	@RequestMapping(path = "/recuperarAssento/{id}", method = {RequestMethod.PUT})
	public ResponseEntity<ApiResponse> recuperarAssento(@PathVariable Long id) {
		Assento assento = assentoRepository.findById(id).orElse(null);
		
		try {
			if(assento != null) {
				assento.setDeleted(false);
				clienteRepository.save(assento);
				return ResponseEntity.ok(new ApiResponse(true, "Assento " + id + " recuperado com sucesso"));
			}
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(false, "Assento não encontrado"));
	}
	
}