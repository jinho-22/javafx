package test;

import java.util.Scanner;

public class GradeP {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 괄호안 : 매개변수
		
		System.out.print("학생이 몇 명입니까?(숫자만 입력) ");
		int num = sc.nextInt();
		
//		People pl1 = new People();
//		People pl2 = new People();
//		People pl3 = new People();
		
		// 객체 배열
		People[] stu = new People[num];
		
		// stu[0] = new People();
		// 객체 배열 초기화 (생성자를 이용해 학번 자동 입력)
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new People(i + 1);
		}
		
		// 키보드 이용하여 데이터입력 (성명, 국어점수, 수학점수, 영어점수)
		for (int i = 0; i < stu.length; i++) {
			System.out.println("이름을 입력하세요 : ");
			stu[i].setName(sc.next());
			System.out.println("국어점수를 입력하세요 : ");
			stu[i].setKorScore(sc.nextInt());
			System.out.println("수학점수를 입력하세요 : ");
			stu[i].setMathScore(sc.nextInt());
			System.out.println("영어점수를 입력하세요 : ");
			stu[i].setEngScore(sc.nextInt());
		}
		
		// 석차 처리
//		A 99  1 1+1 = 2
//		B 97  1 1+1+1 = 3
//		C 100 1
		for(int i = 0; i < stu.length; i++) {
			int rank = 1;
			for (int j = 0; j < stu.length; j++) {
				if (stu[i].getSumScore() < stu[j].getSumScore()) {
					rank++;
				}
			}
			stu[i].setRank(rank);
		}
		
		// 성적 출력
		System.out.println("======================== 성적처리 ========================");
		System.out.printf("%3s\t %3s\t %3s\t %3s\t %3s\t %3s\t %3s\t %3s\n", 
				"학번", "이름", "국어점수","수학점수", 
				"영어점수", "합계", "평균", "등수");
		for(int i = 0; i < stu.length; i++) {
			stu[i].printScore();
		}
	}
	
}
