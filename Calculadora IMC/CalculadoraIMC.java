import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class CalculadoraIMC extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
    public void start(Stage palco) {
    	//Campos de entrada Label
    	Label etiquetaPeso = new Label("Peso");
    	Label etiquetaAltura = new Label("Altura");

    	//Campo de textos para entrada de dados
    	TextField campoPeso = new TextField();
    	campoPeso.setPromptText("Peso em Kg -> EX: 60");
    	TextField campoAltura = new TextField();
    	campoAltura.setPromptText("Altura em Metros -> EX: 1.70");

    	//Resultados dos Dados IMC
    	Label etiquetaResultado = new Label();

    	//Botão e função para envio de dados
    	Button botaoCalc = new Button("Calcular IMC");
    	botaoCalc.setOnAction(e -> {
    		double peso = Double.parseDouble(campoPeso.getText());
    		double altura = Double.parseDouble(campoAltura.getText());

    		double imc = peso/(altura*altura);
    		etiquetaResultado.setText(String.format("Seu IMC é: %.2f",imc));
    	});

    	//Layout Vertical
    	VBox layout = new VBox(10, etiquetaPeso,campoPeso,etiquetaAltura,campoAltura,botaoCalc,etiquetaResultado);
    	layout.setPadding(new Insets(10));
    	layout.setAlignment(Pos.CENTER);

    	//cena e palco
        Scene cena = new Scene(layout, 400, 600);

        palco.setTitle("Calculadora IMC");
        palco.setScene(cena);
        palco.show();
    }
}