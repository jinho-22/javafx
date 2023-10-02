package chap01;

public class Ex01 {

	public static void main(String[] args) {
		
		String[] nameArray = new String[5];
		
		nameArray[0] = "유재석";
		nameArray[1] = "홍길동";
		nameArray[2] = "장발장";
		nameArray[3] = "로미오";
		nameArray[4] = "줄리엣";
		
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
		System.out.println("=== 향상된 for문(for - each) ===");
		
		for(String name : nameArray) {
			System.out.println(name);
		}
	}
}
