package ch04.sec08;

public class Chapter1Ex {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=3; i<=100; i++) {
			
			if(i%3 == 0) {
				sum += i;
			}
	
		
		}
		System.out.println("1~" + (i-1 + "정수 중 3의 배수의 총합 : " + sum));
	}
	
	
}
