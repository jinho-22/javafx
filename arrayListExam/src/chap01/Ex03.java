package chap01;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		
		for(int num : numList) {
			System.out.println(num * num);
		}
	}
}
