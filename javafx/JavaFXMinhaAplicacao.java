import javafx.application.Application;
import javafx.stage.Stage;
// Controles
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

// Para compilar:
// javac --module-path $PATH_TO_FX --add-modules javafx.controls JavaFXMinhaAplicacao.java
// Para Rodar:
// java --module-path $PATH_TO_FX --add-modules javafx.controls JavaFXMinhaAplicacao


public class JavaFXMinhaAplicacao extends Application{
	
	@Override
	public void start(Stage palco){
		palco.setTitle("Meu primeiro app FX");

		Label label = new Label("Olá, eu sou uma etiqueta (Label)");
		Button botao = new Button("Clique Aqui!");
		TextField campoTexto = new TextField();

		VBox layout = new VBox(label, botao , campoTexto); //Passar em ordem vertical os meus "Controles"!

		Scene cena = new Scene(layout,300, 200);// Chamando meu Layout para a cena e definindo tamanho, no caso 300x200

		palco.setScene(cena);
		palco.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}