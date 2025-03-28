package ch04.sec08;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int max = 0; //초기화 진행
		
		//정수를 다섯번 입력하도록 해라
		for(int i = 1; i<=5; i++) {
			System.out.print("숫자:"); //프롬포트 출력
			 num = sc.nextInt();
			 if(max<num) {
				 max = num;
			 }
			
		}
		
		System.out.println("최대값은 " + max);
		//최댓값이 출력되어야지
		
	}
}
	  
