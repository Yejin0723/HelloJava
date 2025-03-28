package ch05.sec06;

import java.util.Scanner;

public class ArrayLengthExample2 {
	public static void main(String[] args) {
		//배열 변수 선언과 배열 대입
		int[] scores = new int[3];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("총합과 평균을 구할 정수 3가지를 입력하세요.");
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i+1) + "번째 정수 입력: ");
			scores[i] = sc.nextInt();
		}
		
		//배열 항목의 총합 구하기
		int sum = 0;
		for(int i=0; i<scores.length; i++) { //i<=scores.length "="등호 절대 불가!
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		//배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}

