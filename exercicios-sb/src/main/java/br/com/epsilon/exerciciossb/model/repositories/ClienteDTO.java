package br.com.epsilon.exerciciossb.model.repositories;

public class ClienteDTO {

	private Long id;
	private String nome;
	private Long assentoId;
	
	public ClienteDTO() {
		super();
	}
	
	public ClienteDTO(Long id, String nome, Long assentoId) {
		super();
		this.id = id;
		this.nome = nome;
		this.assentoId = assentoId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getAssentoId() {
		return assentoId;
	}

	public void setAssentoId(Long assentoId) {
		this.assentoId = assentoId;
	}
	
}