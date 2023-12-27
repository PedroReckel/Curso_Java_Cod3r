package modelo.umpramuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import modelo.basico.Produto;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Pedido pedido;
	
	// Quando eu deixo a relação como LAZY a relação só será chamada quando eu  
	// de fato chamar ela. Se eu deixar como EAGER ele chamará os dados da 
	// relação automaticamente ao chamar a entidade pai (Para um). 
	// Usar o EAGER aumentará o consumo de memoria. Só deverá usar ele quando 
	// necessário. O Ideal é usar sempre o LAZY (Mais informações: Aula 351)
	@ManyToOne(fetch = FetchType.EAGER)
	private Produto produto;
	
	@Column(nullable = false)
	private int quatidade;
	
	@Column(nullable = false)
	private Double preco;
	
	public ItemPedido() {
		
	}

	public ItemPedido(Pedido pedido, Produto produto, int quatidade) {
		super();
		this.setPedido(pedido);
		this.setProduto(produto);
		this.setQuatidade(quatidade);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
		
		if(produto != null && this.preco == null) {
			this.setPreco(produto.getPreco());
		}
	}

	public int getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}