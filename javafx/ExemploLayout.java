// Importa a classe base necessária para qualquer aplicação JavaFX
import javafx.application.Application;

// Importa a enumeração usada para definir alinhamentos (CENTER, LEFT, RIGHT etc.)
import javafx.geometry.Pos;

// Importa a classe Scene, que representa tudo que aparece dentro da janela
import javafx.scene.Scene;

// Importa o componente de botão
import javafx.scene.control.Button;

// Importa diferentes gerenciadores de layout
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;     // layout horizontal
import javafx.scene.layout.VBox;     // layout vertical

// Importa Stage, que é a janela principal da aplicação
import javafx.stage.Stage;

// Comando de compilação caso precise compilar manualmente no terminal
// javac --module-path $PATH_TO_FX --add-modules javafx.controls ExemploLayout.java

public class ExemploLayout extends Application { // A classe herda Application, tornando-se uma aplicação JavaFX
    
    @Override
    public void start(Stage palco){  // O método start() é executado automaticamente quando o programa inicia
       
        // Criação de quatro botões, cada um com um texto
        Button botao1 = new Button("Botão 1");
        Button botao2 = new Button("Botão 2");
        Button botao3 = new Button("Botão 3");
        Button botao4 = new Button("Botão 4");

        // Cria um HBox (layout horizontal) contendo botao1 e botao2
        HBox hbox = new HBox(botao1, botao2);
        hbox.setAlignment(Pos.CENTER); // Centraliza os botões dentro do HBox

        // Cria um VBox (layout vertical) contendo botao3 e botao4
        VBox vbox = new VBox(botao3, botao4);
        vbox.setAlignment(Pos.CENTER); // Centraliza os botões dentro do VBox

        // Cria um BorderPane (layout com regiões Top, Bottom, Left, Right e Center)
        BorderPane borderPane = new BorderPane();
        
        // Coloca o HBox na parte de cima (Top) do BorderPane
        borderPane.setTop(hbox);
        
        // Coloca o VBox no centro do BorderPane
        borderPane.setCenter(vbox);

        // Cria a cena com o layout BorderPane, com tamanho de 400x400 pixels
        Scene cena = new Scene(borderPane, 400, 400);

        // Define a cena dentro do Stage (janela)
        palco.setScene(cena);

        // Exibe a janela na tela
        palco.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação JavaFX e chama o método start()
    }
}
