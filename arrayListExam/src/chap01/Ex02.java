package chap01;

import java.util.ArrayList;

public class Ex02 {
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		
		nameList.add("유재석");
		
		System.out.println(nameList.size());
		
		nameList.add("홍길동");
		System.out.println(nameList.size());
	
		System.out.println(nameList.get(0));
		System.out.println(nameList.get(1));
		System.out.println(nameList);
		
		nameList.add("장발장");
		nameList.add("로미오");
		nameList.add("줄리엣");
		System.out.println(nameList.size());
		System.out.println(nameList);
		
		nameList.remove(2);
		System.out.println(nameList);
		
	}
}
