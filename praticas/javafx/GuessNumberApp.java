import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class GuessNumberApp extends Application {

    private int secretNumber;   // número secreto
    private Label messageLabel; // mensagem para o usuário

    @Override
    public void start(Stage stage) {

        // Gera um número secreto entre 1 e 100
        Random rand = new Random();
        secretNumber = rand.nextInt(100) + 1;

        Label title = new Label("Jogo: Adivinhe o Número (1 a 100)");
        TextField inputNumber = new TextField();
        inputNumber.setPromptText("Digite um número...");
        
        Button guessButton = new Button("Tentar");
        Button resetButton = new Button("Reiniciar Jogo");
        messageLabel = new Label("");

        guessButton.setOnAction(e -> {
            try {
                int guess = Integer.parseInt(inputNumber.getText());

                if (guess == secretNumber) {
                    messageLabel.setText("🎉 Parabéns! Você acertou!");
                } else if (guess < secretNumber) {
                    messageLabel.setText("O número é MAIOR!");
                } else {
                    messageLabel.setText("O número é MENOR!");
                }

            } catch (NumberFormatException ex) {
                messageLabel.setText("Digite um número válido!");
            }

            inputNumber.clear();
        });

        resetButton.setOnAction(e -> {
            secretNumber = rand.nextInt(100) + 1;
            messageLabel.setText("Jogo reiniciado! Tente novamente.");
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15));
        layout.getChildren().addAll(title, inputNumber, guessButton, resetButton, messageLabel);

        Scene scene = new Scene(layout, 300, 220);

        stage.setTitle("Adivinhe o Número");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
