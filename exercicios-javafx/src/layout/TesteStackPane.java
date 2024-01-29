package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {

	public TesteStackPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		getChildren().addAll(c2, c3, c4, c5, c6, c1); // Colocando o c1 por ultimo para ele aparecer primeiro quando a aplicação for iniciada
		
		setOnMouseClicked(e -> {
			if(e.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront(); // Pegar o elemento do indice 0 e jogar para o final do array
			} else {
				getChildren().get(5).toBack(); // Pegar o elemento do indice 5 e jogar para o inicio do array
			}
		});
		
		Thread t = new Thread(() -> {
			while(true) { // Laço infinito
				try {
					Thread.sleep(3000);
					
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
				} catch (Exception e) {
			
				}
			}
		});
		
		t.setDaemon(true); // Se a thread pricipal da aplicação morrer automaticamente essa thread também vai morrer
		t.start();
		
	}
	
}