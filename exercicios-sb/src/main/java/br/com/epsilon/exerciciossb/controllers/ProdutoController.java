package br.com.epsilon.exerciciossb.controllers;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.epsilon.exerciciossb.model.entities.Produto;
import br.com.epsilon.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired // Com essa notação ele vai automaticamente colocar um objeto dentro desse atributo
	private ProdutoRepository produtoRepository;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) { // Aqui eu uso o Valid para garantir que ele vai está aderente as regras definidas nas anotations da classe Produto
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping(path="/nome/{parteNome}")
	public Iterable<Produto>  obterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
		if(qtdePagina >= 5) qtdePagina = 5;
		PageRequest page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAllNotDeleted(page);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Produto> obterProdutoPorId(@PathVariable int id) {
		Optional<Produto> produtoOptional = produtoRepository.findByIdAndDeletedFalse(id);
		
		return produtoOptional.map(produto -> ResponseEntity.ok().body(produto))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@RequestMapping(path = "/excluirProduto/{id}", method = {RequestMethod.PUT})
	public void excluirProduto(@PathVariable int id) {
		Produto produto = produtoRepository.findById(id).orElse(null);
		
		try {
			if(produto != null) {
				produto.setDeleted(true);
				produtoRepository.save(produto);
			}
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(path = "/recuperarProduto/{id}", method = {RequestMethod.PUT})
	public void recuperarProduto(@PathVariable int id) {
		Produto produto = produtoRepository.findById(id).orElse(null);
		
		try {
			if(produto != null) {
				produto.setDeleted(false);
				produtoRepository.save(produto);
			}
		} catch (EntityNotFoundException  e) {
			e.printStackTrace();
		}
	}
		
}