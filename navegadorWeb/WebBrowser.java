import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

// javac --module-path $PATH_TO_FX --add-modules javafx.web WebBrowser.java

public class WebBrowser extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
    public void start(Stage palco) {
    	palco.setTitle("Navegador Javafx");

    	TextField campoUrl = new TextField();
    	WebView navegador = new WebView();
    	WebEngine motor = navegador.getEngine();

    	// Carregar uma pagina web quando apertar enter
    	//campoUrl.setOnAction(e -> motor.load(campoUrl.getText() ));
    	campoUrl.setOnAction(e -> motor.load(formatUrl(campoUrl.getText()) ));

    	VBox vbox = new VBox();	
    	vbox.getChildren().addAll(campoUrl,navegador);//Forma alternativa de adicionar elementos no vbox
    	Scene cena = new Scene(vbox, 600, 600);

    	palco.setScene(cena);

    	palco.show();
    }

    public String formatUrl (String url){
    	if (!url.startsWith("http://") && !url.startsWith("https://") ) {
    		url = "http://" + url;
    	}
    	return url;
    }
}
