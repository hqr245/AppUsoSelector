package es.ieslosmontecillos.appusoselector;

import es.ieslosmontecillos.componentes_caroantonio.SelectorDeslizamiento;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController  implements Initializable {


    @FXML
    public Label bottomLabel;
    @FXML
    private SelectorDeslizamiento selector1;
    @FXML
    private SelectorDeslizamiento selector2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        ArrayList<String> items = new ArrayList<>();

        items.add("Uno");
        items.add("Dos");
        items.add("Tres");
        items.add("Cuatro");
        items.add("Cinco");
        items.add("Seis");
        items.add("Siete");
        items.add("Ocho");
        items.add("Nueve");
        items.add("Diez");

        selector1.setItems(items);
        selector2.setItems(items);

        selector1.setOnAction(event -> {
            bottomLabel.setText("Selector de arriba pulsado");
            bottomLabel.setStyle("-fx-background-color: #0f0");
        });


        selector2.setOnAction(event -> {
            bottomLabel.setText("Selector de abajo pulsado");
            bottomLabel.setStyle("-fx-background-color: #f00");
        });


    }
}