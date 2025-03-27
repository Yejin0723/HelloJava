package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		//숫자 연산
		String result1 = 10 + 2 + 8 + ""; //정수값을 문자열로 변환하는 방법
		int result11 = 10 + 2 + 8;
		System.out.println("result1: " + result1);
		System.out.println("result11: " + result11);
		
		//결합 연산
		String result2 = 10 + 2 + "8"; //정수연산 + 문자열 > String 클래스는 산수 연산이 가능하다. //
		System.out.println("result2: " + result2);
		
		String result3 = 10 + "2" + 8; //102 > 문자열 전환 > +8 문자열
		System.out.println("result3: " + result3);
		
		String result4 = "10" + 2 + 8; // 연산 순서대로 
		System.out.println("result4: " + result4);
		
		String result5 = "10" + (2 + 8); // 
		System.out.println("result5: " + result5);
		
		
		
		String a = "Hello, ";
		String b = "java";
		System.out.println("result6: " + a+b);
		
		
		//10+10 = 20 값이 나오게
		String str = "10";
		byte number = Byte.parseByte(str);
		System.out.println(number+number);
		
		
	}
}


