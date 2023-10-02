package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController implements Initializable {
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	@FXML
	private TextField txt;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				handleBtn1Action(event);
			}
		});
		
		// 버튼2, 3은 람다식표현으로 쉽게 생성
		btn2.setOnAction(event->handleBtn2Action(event));
		btn3.setOnAction(event->handleBtn3Action(event));
				
	}
	public void handleBtn1Action(ActionEvent event) {
		txt.setText("버튼 1 클릭");
	}
	public void handleBtn2Action(ActionEvent event) {
		txt.setText("버튼 2 클릭");
	}
	public void handleBtn3Action(ActionEvent event) {
		txt.setText("버튼 3 클릭");
	}
}
