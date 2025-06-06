package ch02.sec12;

import java.util.Scanner;

public class PrintfExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		int value = Integer.parseInt(scanner.nextLine());
		
		System.out.printf("상품의 가격:%d원\n", value); //printf는 줄바꿍미 안되니 /n을 추가해둠.
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-6s | %10s\n", 1, name, job);
	}
}	
