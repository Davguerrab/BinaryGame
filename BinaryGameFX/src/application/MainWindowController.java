package application;

import org.apache.commons.lang3.ArrayUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;


public class MainWindowController {



	@FXML private Label result;
	@FXML private Label SumOf;
	private int[] Potencia64 = {64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99};
	private int[] Potencia32 = {32,33,	34,	35,	36,37,	38,	39,	40,	41,42,	43,	44,	45,	46,47,	48,	49,	50,	51,52,	53,	54,	55,	56,57,	58,	59,	60,	61,62,	63,	96,	97,	98,99};
	private int[] Potencia16 = {16,	17,	18,	19,	20, 21,	22,	23,	24,	25,26,	27,	28,	29,	30,31,	48,	49,	50,	51,52,	53,	54,	55,	56,57,	58,	59,	60,	61,62,	63,	80,	81,	82,83,	84,	85,	86,	87,88,	89,	90,	91,	92,93,	94,	95};
	private int[] Potencia8 = {8,	9,	10,	11,	12,13,	14,	15,	24,	25,26,	27,	28,	29,	30,31,	40,	41,	42,	43,44,	45,	46,	47,	56,57,	58,	59,	60,	61,62,	63,	72,	73,	74,75,	76,	77,	78,	79,88,	89,	90,	91,	92,93,	94,	95};
	private int[] Potencia4 = {4,	5,	6,	7,	12,13,	14,	15,	20,	21,22,	23,	28,	29,	30,31,	36,	37,	38,	39,44,	45,	46,	47,	52,53,	54,	55,	60,	61,62,	63,	68,	69,	70,71,	76,	77,	78,	79,84,	85,	86,	87,	92,93,	94,	95};
	private int[] Potencia2 = {2,	3,	6,	7,	10,11,	14,	15,	18,	19,22,	23,	26,	27,	30,31,	34,	35,	38,	39,42,	43,	46,	47,	50,51,	54,	55,	58,	59,62,	63,	66,	67,	70,71,	74,	75,	78,	79,82,	83,	86,	87,	90,91,	94,	95,	98,	99};
	private int[] Potencia1 = {1,	3,	5,	7,	9,11,	13,	15,	17,	19,21,	23,	25,	27,	29,31,	33,	35,	37,	39,41,	43,	45,	47,	49,51,	53,	55,	57,	59,61,	63,	65,	67,	69,71,	73,	75,	77,	79,81,	83,	85,	87,	89,91,	93,	95,	97,	99};
	private boolean reset = false;
	@FXML private Circle circle64 = new Circle();
	@FXML private Circle circle32 = new Circle();
	@FXML private Circle circle16 = new Circle();
	@FXML private Circle circle8 = new Circle();
	@FXML private Circle circle4 = new Circle();
	@FXML private Circle circle2 = new Circle();
	@FXML private Circle circle1 = new Circle();

	@FXML private Label label64 = new Label();
	@FXML private Label label32 = new Label();
	@FXML private Label label16 = new Label();
	@FXML private Label label8 = new Label();
	@FXML private Label label4 = new Label();
	@FXML private Label label2 = new Label();
	@FXML private Label label1 = new Label();

	

	 Stop[] stops = new Stop[] { new Stop(0, Color.FIREBRICK), new Stop(1, Color.RED)};
     LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
     
     Color c = Color.web("0x007fbd",1.0);
     
	 Stop[] stops1 = new Stop[] { new Stop(0, Color.GREEN), new Stop(1, Color.LIMEGREEN)};
     LinearGradient lg2 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops1);

	
	public void reset(){
		circle64.setFill(lg1);
		circle32.setFill(lg1);
		circle16.setFill(lg1);
		circle8.setFill(lg1);
		circle4.setFill(lg1);
		circle2.setFill(lg1);
		circle1.setFill(lg1);
		SumOf.setText("");
		label64.setText("0");
		label32.setText("0");
		label16.setText("0");
		label8.setText("0");
		label4.setText("0");
		label2.setText("0");
		label1.setText("0");
	}

	@FXML
	public void Search(ActionEvent event){
		reset();
		String value = ((Button)event.getSource()).getText();
		//System.out.println("Presione un boton");
		result.setText("Has seleccionado el numero " + value);
		//Change String to int for ArrayUtils
		int number = Integer.parseInt(((Button)event.getSource()).getText());
		String SumOfStr = "La suma de :";
		boolean flag = true;
		//If statements to activate the circles
		if(ArrayUtils.contains(Potencia64,number)){
			label64.setText("1");
			circle64.setFill(lg2);
			SumOfStr += ("64");
			flag = false;
		}
		if(ArrayUtils.contains(Potencia32,number)){
			label32.setText("1");
			circle32.setFill(lg2);
			if(flag){
				SumOfStr += ("32");
				flag = false;
			}	
			else{
				SumOfStr += ("+32");
			}
		}
		if(ArrayUtils.contains(Potencia16,number)){
			label16.setText("1");
			circle16.setFill(lg2);
			if(flag){
				SumOfStr += ("16");
				flag = false;
			}
			else{
				SumOfStr += ("+16");
			}
		}
		if(ArrayUtils.contains(Potencia8,number)){
			label8.setText("1");
			circle8.setFill(lg2);
			if(flag){
				SumOfStr += ("8");
				flag = false;
			}
			else{
				SumOfStr += ("+8");
			}
		}
		if(ArrayUtils.contains(Potencia4,number)){
			label4.setText("1");
			circle4.setFill(lg2);
			if(flag){
				SumOfStr += ("4");
				flag = false;
			}
			else{
				SumOfStr += ("+4");
			}
		}
		if(ArrayUtils.contains(Potencia2,number)){
			label2.setText("1");
			circle2.setFill(lg2);
			if(flag){
				SumOfStr += ("2");
				flag = false;
			}
			else{
				SumOfStr += ("+2");
			}
		}
		if(ArrayUtils.contains(Potencia1,number)){
			label1.setText("1");
			circle1.setFill(lg2);
			if(flag){
				SumOfStr += ("1");
				flag = false;
			}
			else{
				SumOfStr += ("+1");
			}
		}
		SumOfStr += ("=" + value);
		SumOf.setText(SumOfStr);
	}
}

