package modelo.composicao;

import javax.persistence.Embeddable;

// Uma vez que eu marco uma classe como Embeddable ela não é mapeada para dentro do banco de dados
// Esses atributos da classe Endereco serão compartilhados por varias tabelas
@Embeddable		
public class Endereco {

	private String logradouro;
	private String complemento;
	
	public Endereco() {
		
	}
	
	public Endereco(String logradouro, String complemento) {
		this.logradouro = logradouro;
		this.complemento = complemento;
	}

	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	// TODO: Persistir alguns dados nas tabelas de Fornecedor e Funcionário
	
}