package application;

public class CalculatorModel {

	public String calculate(String op, int x, int y) {
		int result = 0;
		

		switch(op) {
		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		case "*":
			result = x * y;
			break;
		case "/":
			result = x / y;
			break;
			default:
				System.out.println("잘못된 연산이 들어왔습니다.");
				break;
		}
		return Integer.toString(result);
	}
	
}
