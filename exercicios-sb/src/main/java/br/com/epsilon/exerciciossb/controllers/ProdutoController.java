package br.com.epsilon.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	@GetMapping(path="/nome/{parteNome}")
	public Iterable<Produto>  obterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
		if(qtdePagina >= 5) qtdePagina = 5;
		PageRequest page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	// ToDo: Fazer um softdelete
		
}