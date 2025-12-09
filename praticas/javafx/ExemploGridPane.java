// Importa o layout GridPane, que organiza elementos em linhas e colunas
import javafx.scene.layout.GridPane;

// Importa a classe Insets, usada para definir margens internas (padding)
import javafx.geometry.Insets;

// Importa a classe base para criar uma aplicação JavaFX
import javafx.application.Application;

// Importa Stage, que representa a janela da aplicação
import javafx.stage.Stage;

// Importa Scene, que representa o conteúdo exibido dentro da janela
import javafx.scene.Scene;

// Importa componentes de interface
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ExemploGridPane extends Application {

    @Override
    public void start(Stage palco) {  // Método executado automaticamente ao iniciar o JavaFX
        
        // --- ELEMENTOS DA INTERFACE ---

        // Rótulos (textos descritivos)
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("Email:");
        
        // Campos de texto onde o usuário digita informações
        TextField campoNome = new TextField();
        TextField campoEmail = new TextField();

        // Botão simples
        Button botaoEnviar = new Button("Enviar");


        // --- CONFIGURAÇÃO DO GRIDPANE (Layout em tabela) ---

        GridPane gridpane = new GridPane();  // Cria o GridPane (linhas x colunas)

        gridpane.setHgap(8);                 // Espaçamento horizontal entre colunas
        gridpane.setVgap(8);                 // Espaçamento vertical entre linhas

        // Define um padding (margem interna) de 5px ao redor do GridPane
        gridpane.setPadding(new Insets(5));

        // Adiciona uma linha (linha 0) com dois elementos: rótulo e campo
        gridpane.addRow(0, rotuloNome, campoNome);

        // Linha 1: rótulo e campo de email
        gridpane.addRow(1, rotuloEmail, campoEmail);

        // Linha 2: apenas o botão (vai ficar na primeira coluna da linha)
        gridpane.addRow(2, botaoEnviar);


        // --- CONFIGURAÇÃO DA CENA E JANELA ---

        // Cria a cena com o GridPane como layout principal, 400x400 pixels
        Scene cena = new Scene(gridpane, 400, 400);

        // Coloca a cena dentro do palco (janela)
        palco.setScene(cena);

        // Exibe a janela
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);  // Inicializa a aplicação JavaFX
    }
}
