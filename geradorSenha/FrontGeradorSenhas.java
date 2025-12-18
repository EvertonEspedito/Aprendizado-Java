import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

// javac --module-path $PATH_TO_FX --add-modules javafx.controls FrontGeradorSenhas.java

public class FrontGeradorSenhas extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
    public void start(Stage palco) {
    	palco.setTitle("Gerador de Senhas Javafx");

    	Label labelTamanhoSenha = new Label("Tamanho da Senha");

    	TextField campoTamanhoSenha = new TextField();
    	campoTamanhoSenha.setText("8"); //Sugestão de Tamanho

    	Label senhaGerada = new Label("Senha Gerada:");

    	TextField campoSenhaGerada = new TextField();
    	campoSenhaGerada.setEditable(false);
    	campoSenhaGerada.setStyle("-fx-background-color: black; -fx-text-fill: Cyan;");

    	Button bGerarSenha = new Button("Gerar Senha");
    	bGerarSenha.setOnAction( e ->{
    		// Quando apertar o botão
    		int tamanhoSenha = Integer.parseInt(campoTamanhoSenha.getText());// Pegar tamanho da senha
    		String senha = GeradorDeSenhas.gerarSenhas(tamanhoSenha);

    		campoSenhaGerada.setText(senha);
    	});
    	bGerarSenha.setStyle(
    		"-fx-background-color: green;" +
    		"-fx-text-fill: white;" +
    		"-fx-background-radius: 5;"
		);

    	//Layout Vertical
    	VBox layout = new VBox(labelTamanhoSenha, campoTamanhoSenha, bGerarSenha
    		, senhaGerada, campoSenhaGerada);
    	layout.setAlignment(Pos.CENTER);
      	layout.setSpacing(10); //Espaço entre os componentes!
      	layout.setPadding(new Insets(10)); //Espaço entre as bordas!
    	//cena e palco
      	Scene cena = new Scene(layout, 300, 200);

      	palco.setTitle("Gerador de Senha");
      	palco.setScene(cena);
      	palco.show();
    }
}