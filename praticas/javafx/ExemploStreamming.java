import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;


public class ExemploStreamming extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) {

        WebView webView = new WebView();
        String caminhoWeb = "https://www.youtube.com/watch?v=U1bt0SBdfJo";

        webView.getEngine().load(caminhoWeb);

        Scene cena = new Scene(webView, 800, 600);

        palco.setTitle("Exemplo de Video Web Streming no JavaFX");
        palco.setScene(cena);
        palco.show();
    }
}
