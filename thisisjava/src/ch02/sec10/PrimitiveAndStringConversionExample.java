package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); //문자열로 되어있지만, 정수값으로 변환한다.
		double value2 = Double.parseDouble("3.14"); //문자열로 되어있지만, 실수값으로 변환한다. 
		boolean value3 = Boolean.parseBoolean("true"); //문자열로 되어있지만, 불린으로으로 변환한다.
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10); // 정수값을 문자열로 바꿔준다.
		String str2 = String.valueOf(3.14); // 실수값을 문자열로 바꿔준다.
		String str3 = String.valueOf(true);		
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}
}
