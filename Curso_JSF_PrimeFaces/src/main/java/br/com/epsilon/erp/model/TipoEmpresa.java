package br.com.epsilon.erp.model;

public enum TipoEmpresa {

	MEI("Microempreendedor Individual"),
	EIRELI("Empresa Individual de Responsabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anônima");
	
	private String descricao;
	
	TipoEmpresa(String Descricao) {
		this.descricao = Descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}