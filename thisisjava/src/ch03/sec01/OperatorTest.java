package ch03.sec01;

public class OperatorTest {
public static void main(String[] args) {
	int a = 2;
	int b = 7;
	int result1;
	int result2;
	
	result1 = b/a; //(double) 강제 형변환
	result2 = b%a;
	
	System.out.println("result1(몫): " + result1);
	System.out.println("result2(나머지): " + result2);
}
}
