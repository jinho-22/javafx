package test;

// public 클래스는 딱 하나만 존재할 수 있다.

public class People {
		
		// 필드 정의
		private int stuNum; 		// 학번
		private String name; 		// 이름
		private int korScore; 		// 국어점수
		private int mathScore; 		// 수학점수
		private int engScore; 		// 영어점수
		private int sumScore; 		// 합계
		private double avgScore; 	// 평균
		private int	rank; 			// 등수	
		
		// 생성자 정의 (오버로딩 사용)
		public People() {} 
		
		public People(int stuNum) {
			this.stuNum = stuNum;
		}
		
		// 메소드 - GETTER
		public int getStuNum() {
			return stuNum;
		}
		public String getName() {
			return name;
		}
		public int getKorScore() {
			return korScore;
		}
		public int getMathScore() {
			return mathScore;
		}
		public int getEngScore() {
			return engScore;
		}
		public int getSumScore() {
			return this.korScore + this.mathScore + this.engScore;
		}
		public double getAvgScore() {
			return getSumScore() / 3.0;
		}
		public int getRank() {
			return rank;
		}
		
		// 메소드 - SETTER
		public void setStuNum(int stuNum) {
			if(stuNum <= 0) {
				System.out.println("잘못된 학번 입력");
			}else {
				this.stuNum = stuNum;	
			}
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setKorScore(int korScore) {
			this.korScore = korScore;
		}
		public void setMathScore(int mathScore) {
			this.mathScore = mathScore;
		}
		public void setEngScore(int engScore) {
			this.engScore = engScore;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		
		// 일반 메소드
		void printScore() {
			System.out.printf("%3d\t %3s\t %3d\t %3d\t %3d\t %3d\t %3.2f\t %3d\n", 
					this.getStuNum(), this.getName(),this.getKorScore(), this.getMathScore(), 
					this.getEngScore(), this.getSumScore(), this.getAvgScore(), 
					this.getRank());
		}
		
		
}
