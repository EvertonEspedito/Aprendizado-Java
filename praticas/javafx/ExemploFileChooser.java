import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.Button;

import javafx.stage.FileChooser;
import java.io.File;

public class ExemploFileChooser extends Application {
	public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) {

        FileChooser seletorDeArquivos = new FileChooser();
        seletorDeArquivos.setTitle("Escolha um Arquivo");

        Button botaoAbrir = new Button("Escolha um Arquivo");
        botaoAbrir.setOnAction ( e -> {
        	File arquivoSelecionado = seletorDeArquivos.showOpenDialog(palco);
        	if(arquivoSelecionado != null){
        		exibirImagem(arquivoSelecionado,palco);
        	}
        });

        botaoAbrir.setStyle("-fx-font-weight:bold; -fx-background-color:black; -fx-background-color: #3498db; -fx-border-radius:8px");

        VBox layout = new VBox(botaoAbrir);
        

        Scene cena = new Scene(layout, 400, 600);

        palco.setTitle("Exemplo de Seletor de Arquivo");
        palco.setScene(cena);
        palco.show();
    }

    private void exibirImagem (File arquivo, Stage palcoDoArquivo){
    	Image imagem = new Image(arquivo.toURI().toString());
    	ImageView imageView = new ImageView(imagem);

    	VBox layout;
    	layout = (VBox) palcoDoArquivo.getScene().getRoot();

    	layout.getChildren().add(imageView);

    	imageView.setFitWidth(500);
    	imageView.setFitHeight(500);

    	palcoDoArquivo.setTitle("Seletor de Arquivos");
    }
}