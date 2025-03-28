package ch05.sec05;

public class StringExample {
	
	public static void main(String[] args) {
		String name1 = new String ("자바 프로그래밍");
		String name2 = new String ("홍길동");
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode()); //.hashcode() 주소값 확인하기
		
		System.out.println(name1.length()); //문자열의 개수를 알고 싶을 떈 length
		System.out.println(name2.length());
	}

}
