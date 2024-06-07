/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.javafx;

/**
 *
 * @author khangpt
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
	
    private boolean isPaint = true;
    private boolean isInsidePaint = true;

    @FXML
    private ToggleGroup identical;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	if (isInsidePaint && isPaint) {
    		drawingAreaPane.getChildren().add(new Circle(event.getX(), event.getY(), 4, Color.BLACK));
    	} else if (isInsidePaint && !isPaint) {
    		drawingAreaPane.getChildren().add(new Circle(event.getX(), event.getY(), 6, Color.WHITE));
    	} else {
    		return;
    	}
    }

    @FXML
    void eraserSelected(ActionEvent event) {
    	isPaint = false;
    }

    @FXML
    void penSelected(ActionEvent event) {
    	isPaint = true;
    }
    
    @FXML
    void onMouseExisted(MouseEvent event) {
    	isInsidePaint = false;
    }
    
    @FXML
    void onMouseEntered(MouseEvent event) {
    	isInsidePaint = true;
    }

}