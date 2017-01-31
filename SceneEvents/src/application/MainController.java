package application;

import java.awt.event.ActionEvent;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

	@FXML 
	private Label myMsg;
	
	public void generateRandom(javafx.event.ActionEvent event){
		Random rand = new Random();
		int myRand = rand.nextInt(50) + 1;
		myMsg.setText(Integer.toString(myRand));
	}
	
}
