package ch03.sec06;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); // t
		boolean result2 = (num1 != num2); // f
		boolean result3 = (num1 <= num2); // t
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);   //65 < 66  t
		System.out.println("result4: " + result4);		
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4); 
		System.out.println("result5: " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		String str1 = new String("자바"); // new String
		String str2 = new String("자바"); // new String 같아도 다르다!
		// boolean result = (str1 == str2); 아래 boolean 메소드와 다름. 
		boolean result = str1 == str2;
		boolean result8 = (str1.equals(str2)); // new String("자바") 가 생략되어있다.
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		
		System.out.println("result: " + result);
	}
}



