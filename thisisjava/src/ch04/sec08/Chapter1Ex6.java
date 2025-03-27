package ch04.sec08; // 5번 문제

import java.util.Scanner;

public class Chapter1Ex6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		//잔액변수(정수)
		int i = 0;
		//입금금액변수(정수)
		int x = 0;
		//출금금액
		int y = 0;
		//키보드 입력값 임시저장용 String 문자열 변수
		String s = "";
		
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 ㅣ 2. 출금 ㅣ 3. 잔고 ㅣ 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
						
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.print("예금액>");
				//예금액 입력 받기
				s = scanner.nextLine();
				x = Integer.parseInt(s);
				i += x;
				
			}else if(strNum.equals("2")) {
				System.out.print("출금액>");
				//출금액 입력 받기
				s = scanner.nextLine();
				y = Integer.parseInt(s);
				
			}else if(strNum.equals("3")) {
				i -=y;
				System.out.println("잔고>" + i);

				
			}else if(strNum.equals("4")) {
				break;
			}
			
		}
		
		System.out.println("프로그램종료");
		
	}
}
		

		
		
		
		
			

