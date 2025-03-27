package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue; //즉시 조건식 자리로 감.
			}
			System.out.print(i + " "); //짝수만 찍는 형태
		}
		
		System.out.println();
		
		for(int i=2; i<=10; i += 2) {
			System.out.print(i + " "); //짝수만 찍는 형태
	 }
			
	}
  }
