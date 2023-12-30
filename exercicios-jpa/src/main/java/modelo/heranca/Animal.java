package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long animalId;
	
	private String specie;

	public Animal() {
		super();
	}
	
	public Animal(String specie) {
		this.specie = specie;
	}

	public Long getId() {
		return animalId;
	}

	public void setId(Long id) {
		this.animalId = id;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
}