import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.PrintWriter;

public class ListaDeCompras extends Application {

    // Lista observável (única fonte de dados)
    private ObservableList<String> listaDeCompras =
            FXCollections.observableArrayList();

    private ListView<String> listaVisualizavel = new ListView<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) {
        palco.setTitle("Aplicativo de Lista de Compras");

        // Campo de texto
        TextField textFieldDescricaoItem = new TextField();
        textFieldDescricaoItem.setPromptText("Digite o item");

        // Botões
        Button bAdicionar = new Button("Adicionar Item");
        
        Button bRemover = new Button("Remover Item");
        bRemover.getStyleClass().add("remover");

        Button bExportar = new Button("Exportar Lista");

        // Barra de ferramentas
        ToolBar caixaDeFerramentas = new ToolBar(bAdicionar, bRemover);

        // Labels
        Label labelAdicionar = new Label("Digite o que deseja adicionar à lista:");
        Label labelListaDeCompras = new Label("Lista de Compras:");

        // ListView
        listaVisualizavel.setItems(listaDeCompras);

        // Layout
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10));
        vBox.getChildren().addAll(
                labelAdicionar,
                textFieldDescricaoItem,
                caixaDeFerramentas,
                labelListaDeCompras,
                listaVisualizavel,
                bExportar
        );

        // AÇÃO: adicionar item
        bAdicionar.setOnAction(e -> {
            String item = textFieldDescricaoItem.getText();
            if (!item.isEmpty()) {
                listaDeCompras.add(item);
                textFieldDescricaoItem.clear();
            }

        });

        // AÇÃO: remover item selecionado
        bRemover.setOnAction(e -> {
            String itemSelecionado = listaVisualizavel
                    .getSelectionModel()
                    .getSelectedItem();

            if (itemSelecionado != null) {
                listaDeCompras.remove(itemSelecionado);
            }
        });

        // AÇÃO: exportar lista para arquivo
        bExportar.setOnAction(e -> {
            try (PrintWriter writer = new PrintWriter(new File("listaDeCompras.txt"))) {
                for (String item : listaDeCompras) {
                    writer.println(item);
                }
            } catch (Exception ex) {
                System.out.println("Erro ocorrido: " + ex.getMessage());
            }
        });

        // Cena
        Scene scene = new Scene(vBox, 800, 600);

        scene.getStylesheets().add(
		    getClass().getResource("style.css").toExternalForm()
		);

        palco.setScene(scene);
        palco.show();
    }
}
