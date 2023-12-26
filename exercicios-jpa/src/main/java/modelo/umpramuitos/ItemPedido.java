package modelo.umpramuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@ManyToOne
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