package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

enum status {
	_1of3, _2of3, _3of3
};

public class SampleController implements Initializable{
	
	private status mode = status._1of3;
	private String operator = "";
	private int x = 0;
	private CalculatorModel model = new CalculatorModel();
	
	@FXML
	private Label resultLabel;
	
	@FXML
	private TextArea logTextArea;
	
	@FXML
	private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	
	@FXML
	private Button btnPlus, btnMinus, btnMulti, btnClear, btnEqual, btnDivide;
	
	// EventHandler 등록
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btn0.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				calculateNumber(event);
			}
		});
		btn1.setOnAction(event->calculateNumber(event));
		btn2.setOnAction(event->calculateNumber(event));
		btn3.setOnAction(event->calculateNumber(event));
		btn4.setOnAction(event->calculateNumber(event));
		btn5.setOnAction(event->calculateNumber(event));
		btn6.setOnAction(event->calculateNumber(event));
		btn7.setOnAction(event->calculateNumber(event));
		btn8.setOnAction(event->calculateNumber(event));
		btn9.setOnAction(event->calculateNumber(event));
		
		btnClear.setOnAction(event->calculatorClear());
		
		btnPlus.setOnAction(event->calculateOperator(event));
		btnMinus.setOnAction(event->calculateOperator(event));
		btnDivide.setOnAction(event->calculateOperator(event));
		btnMulti.setOnAction(event->calculateOperator(event));
		
		btnEqual.setOnAction(event->calculateEqualOperator(event));
		
	}
	// 숫자 버튼
	public void calculateNumber(ActionEvent event) {
		// 버튼 이벤트 발생시 해당 버튼의 텍스트값을 int형으로 변환하는 작업
		int n = Integer.parseInt(((Button) event.getSource()).getText());
		if(mode == status._1of3 || mode == status._2of3) {
			String labelTxt = "";
			// 처음 입력되는 숫자가 0일경우에 처리하는 방
			if(!resultLabel.getText().equals("0")) {
				labelTxt = resultLabel.getText();
			}
			resultLabel.setText(labelTxt + Integer.toString(n));
		}
	}
	// 연산자 버튼
	public void calculateOperator(ActionEvent event) {
		String op = ((Button)event.getSource()).getText();
		if ((mode == status._1of3 || mode == status._3of3) && !resultLabel.getText().isBlank()){
			operator = op;
			x = Integer.parseInt(resultLabel.getText());
			resultLabel.setText("");
			mode = status._2of3;
			logTextArea.appendText(Integer.toString(x) + " " + op + " ");
		}
	}
	
	// = 버튼
	public void calculateEqualOperator(ActionEvent event) {
		if (mode == status._2of3 && !resultLabel.getText().isBlank()) {
			logTextArea.appendText(resultLabel.getText() + " = ");
			String theResult = model.calculate(operator, x, Integer.parseInt(resultLabel.getText()));
			resultLabel.setText(theResult);
			logTextArea.appendText(theResult + "\n");
			mode = status._3of3;
		}
	}
	
	// Clear 버튼
	public void calculatorClear() {
		resultLabel.setText("");
		logTextArea.clear();
		mode = status._1of3;
	}
}
// 문자를 비교할 때는 equals를 사용하는 것이 좋다.
//String a = "하늘";
//String b = "하늘";
//a == b;  a와 b의 주고값이 같은가?
//a.equals(b);  a와 b의 값이 같은가?
