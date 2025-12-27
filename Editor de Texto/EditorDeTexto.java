import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.File;

import java.io.PrintWriter;
import javafx.scene.control.ToolBar;
import javafx.stage.FileChooser;

public class EditorDeTexto extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
    public void start(Stage palco){
    	// Area de escrita
    	TextArea areaEditavel = new TextArea();

    	// Botão Salvar
    	Button bSalvar = new Button("Salvar");
    	bSalvar.setOnAction(e -> salvarTexto(areaEditavel));
    	// Botão Abrir Arquivo
    	Button bAbrir = new Button("Abrir Arquivo");
    	bAbrir.setOnAction(e -> abrirArquivo(areaEditavel));

    	// Barra de Ferramentas com Botão
    	ToolBar barraDeFerramentas = new ToolBar(bAbrir, bSalvar);

    	// Comfiguração do Layout Principal
    	BorderPane borderPane = new BorderPane();
    	borderPane.setTop(barraDeFerramentas);
    	borderPane.setCenter(areaEditavel);

    	// Cena principal
    	Scene cena = new Scene(borderPane, 800, 600);
    	palco.setTitle("Editor Básico de Texto");
    	palco.setScene(cena);
    	palco.show();


    }

    private void salvarTexto(TextArea textArea) {
        if (arquivoAtual == null) {
            // Se for um arquivo novo
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Salvar Arquivo de Texto");
            arquivoAtual = fileChooser.showSaveDialog(null);
        }

        if (arquivoAtual != null) {
            try (PrintWriter writer = new PrintWriter(arquivoAtual)) {
                writer.print(textArea.getText());
            } catch (Exception e) {
                System.out.println("Erro ao salvar: " + e.getMessage());
            }
        }
    }


    private File arquivoAtual;

    private void abrirArquivo(TextArea textArea) {
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Abrir Arquivo de Texto");

    File file = fileChooser.showOpenDialog(null);

    if (file != null) {
        try {
            arquivoAtual = file;
            textArea.setText(java.nio.file.Files.readString(file.toPath()));
        } catch (Exception e) {
            System.out.println("Erro ao abrir arquivo: " + e.getMessage());
        }
    }
}

}   