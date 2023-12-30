package modelo.heranca;

import javax.persistence.Entity;

@Entity
public class Pet extends Animal {

	private String name;

	public Pet() {
		super();
	}

	public Pet(String name, String specie) {
		super(specie);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}