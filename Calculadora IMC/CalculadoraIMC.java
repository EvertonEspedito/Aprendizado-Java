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
        Label etiquetaTipoResultado = new Label();

    	//Botão e função para envio de dados
    	Button botaoCalc = new Button("Calcular IMC");
    	botaoCalc.setOnAction(e -> {
            try{
    		  double peso = Double.parseDouble(campoPeso.getText().replace(',','.'));
    		  double altura = Double.parseDouble(campoAltura.getText().replace(',','.'));

    		  double imc = peso/(altura*altura);
    		  etiquetaResultado.setText(String.format("Seu IMC é: %.2f",imc));

              if (imc < 17) {
                  etiquetaTipoResultado.setText(String.format("Você esta muito abaixo do peso!"));
              }else if (imc >= 17 && imc <= 18.49) {
                  etiquetaTipoResultado.setText(String.format("Você esta abaixo do peso!"));
              }else if (imc >= 18.5 && imc <= 24.99) {
                  etiquetaTipoResultado.setText(String.format("Você esta no peso normal!"));
              }else if (imc >= 25 && imc <= 29.99) {
                  etiquetaTipoResultado.setText(String.format("Você esta acima do peso!"));
              }else if (imc >= 30 && imc <= 34.99) {
                  etiquetaTipoResultado.setText(String.format("Você esta na obesidade 1!"));
              }else if (imc >= 35 && imc <= 39.99) {
                  etiquetaTipoResultado.setText(String.format("Você esta na obesidade 2(SEVERA)!"));
              }else{
                  etiquetaTipoResultado.setText(String.format("Você esta na obesidade 3(MORBIDA)!"));
              }

            }catch(NumberFormatException ex){
                etiquetaResultado.setText(String.format("Selecione um número válido!"));
                etiquetaTipoResultado.setText(String.format(""));
            }
    	});

    	//Layout Vertical
    	VBox layout = new VBox(10, etiquetaPeso,campoPeso,etiquetaAltura,campoAltura,botaoCalc,etiquetaResultado, etiquetaTipoResultado);
    	layout.setPadding(new Insets(10));
    	layout.setAlignment(Pos.CENTER);

    	//cena e palco
        Scene cena = new Scene(layout, 400, 600);

        palco.setTitle("Calculadora IMC");
        palco.setScene(cena);
        palco.show();
    }
}