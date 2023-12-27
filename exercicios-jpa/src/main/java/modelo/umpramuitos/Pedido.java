package modelo.umpramuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date data;
	
	// Quando eu deixo a relação como LAZY a relação só será chamada quando eu  
	// de fato chamar ela. Se eu deixar como EAGER ele chamará os dados da 
	// relação automaticamente ao chamar a entidade pai (Para um). 
	// Usar o EAGER aumentará o consumo de memoria. Só deverá usar ele quando 
	// necessário. O Ideal é usar sempre o LAZY (Mais informações: Aula 351)
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)  // Relação bidirecional
	private List<ItemPedido> itens;

	public Pedido() {
		this(new Date());
	}
		
	public Pedido(Date data) {
		super();
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
		
}