package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		// Registrar a intenção da namorada ser notificada quando o evento acontecer
		porteiro.registrarObservador(namorada);		
		porteiro.monitorar();
		
	}
	
}