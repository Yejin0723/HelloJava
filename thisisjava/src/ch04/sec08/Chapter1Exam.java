package ch04.sec08;

public class Chapter1Exam {
	public static void main(String[] args) {
	
		String grade = "B";
		int score1 = 0;
		switch(grade) {
			case "A" -> {
				score1 = 100;
			}
			case "B" -> {
				int result = 100-20;
				score1 = result;
			}
			
			default -> {
				score1 = 60;
			}
		}
			System.out.println("점수는 : " + score1 + "  등급은 : " + grade + "  입니다"); 
			
	 }
	}		
	
