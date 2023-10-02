package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

// V : 수직 , H : 수평
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();  			// 수직 방향으로 컨트롤을 배치하는 컨테이너
			root.setPrefWidth(350);  			// VBox의 가로 길이
			root.setPrefHeight(150); 			// VBox의 세로 길이
			root.setAlignment(Pos.CENTER);	 	// 컨트롤들을 중앙 정렬
			root.setSpacing(20); 				// 컨트롤들의 수직 간격
			
			Label label = new Label(); 			// Label 컨트롤 생성
			label.setText("Hello, JavaFX");		// text 속성 설정
			label.setFont(new Font(50)); 		// font 속성 설정
			
			Button button = new Button();		// Button 컨트롤 생성
			button.setText("확인");				// button 속성 설정
			button.setOnAction(event -> Platform.exit()); // 클릭 이벤트 처리
			
			root.getChildren().add(label); 		// Label 컨트롤 추가
			root.getChildren().add(button);		// Button 컨트롤 추가
			
			Scene scene = new Scene(root); 		// Vbox를 루트 컨테이너로 해서 Scene을 생성
			
			primaryStage.setTitle("JavaFX"); 	// 윈도우 제목 설정
			primaryStage.setScene(scene);
			primaryStage.show();				// 윈도우 보여주기
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args); 							// 메인 객체 생성 및 윈도우 생성
	}
}
