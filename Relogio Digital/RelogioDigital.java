import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class RelogioDigital extends Application {

  final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("HH:mm:ss");

	public static void main(String[] args) {
		launch(args);
	}

	@Override
    public void start(Stage palco) {
    	
      Label rotuloTempo = new Label();
      rotuloTempo.setStyle("-fx-font-size: 50px; -fx-text-fill: yellow;");

      //Criação do KeyFrame
      KeyFrame keyFrameAtualizar = new KeyFrame(Duration.ZERO, e -> {
        rotuloTempo.setText(LocalDateTime.now().format(FORMATADOR));
      });

      //Outro Keyframe intervalo de  atualização
      KeyFrame keyFrameIntervalo = new KeyFrame(Duration.seconds(1));

      // Criação da timelina e adião dos keyframes
      Timeline relogio = new Timeline();
      relogio.getKeyFrames().addAll(keyFrameAtualizar,keyFrameIntervalo);

      //Ação de atualizar o rotulo a cada segundo pra sempre
      relogio.setCycleCount(Animation.INDEFINITE);
      relogio.play();

    	//Layout Vertical
    	VBox layout = new VBox(rotuloTempo);
    	layout.setAlignment(Pos.CENTER);
      layout.setStyle("-fx-background-color: black;");
    	//cena e palco
      Scene cena = new Scene(layout, 400, 200);

      palco.setTitle("Relógio Digital");
      palco.setScene(cena);
      palco.show();
    }
}