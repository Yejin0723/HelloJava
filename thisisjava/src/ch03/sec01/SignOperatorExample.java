package ch03.sec01;

public class SignOperatorExample {
	public static void main(String[] args) {
		//부호를 변경시켜주는 연산자는 변수 설정 필요
		
		int x = -100;
		x = -x; 
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b; 
		System.out.println("y: " + y);
	}
}
