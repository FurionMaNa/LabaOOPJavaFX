package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.awt.*;

public class Controller{

    @FXML
    private Button button;

    @FXML
    private TextField xParam;

    @FXML
    private TextField yParam;

    @FXML
    private TextField sizeParam;

    @FXML
    private Pane panelForDraw;

    @FXML
    private RadioButton square;

    @FXML
    public void initialize(){
        button.setOnAction(event -> {
            panelForDraw.getChildren().clear();
            FiguraClass figura;
            try {
                if (square.isSelected()) {
                    figura = new SquareClass(Integer.parseInt(xParam.getText()), Integer.parseInt(yParam.getText()), Integer.parseInt(sizeParam.getText()), panelForDraw);
                } else {
                    figura = new CircleClass(Integer.parseInt(xParam.getText()), Integer.parseInt(yParam.getText()), Integer.parseInt(sizeParam.getText()), panelForDraw);
                }
                figura.Draw();
            }catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ошибка ввода");
                alert.setContentText("Вы не указали все параметры фигуры!!!");
                alert.showAndWait();
            }
        });
    }

}
