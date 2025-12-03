import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ExemploImagem extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) {

        String caminhoImagem = "file:////home/everton/Documentos/PROJETOS/Aprendizado-Java/javafx/imagens/kratos.jpg";

        Image imagem = new Image(caminhoImagem);
        ImageView imagemView = new ImageView(imagem);

        imagemView.setFitWidth(613);
        imagemView.setFitHeight(640);	
        imagemView.setPreserveRatio(true);

        VBox layout = new VBox(imagemView);

        Scene cena = new Scene(layout, 1620, 1050);

        palco.setTitle("Exemplo de Imagem no JavaFX");
        palco.setScene(cena);
        palco.show();
    }
}
