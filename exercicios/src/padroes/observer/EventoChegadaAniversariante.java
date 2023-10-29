package padroes.observer;

//Eu preciso ter uma classe associada ao evento quando eu tenho informações associadas ao evento  

import java.util.Date;

public class EventoChegadaAniversariante {

	private final Date momento;

	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
		
}