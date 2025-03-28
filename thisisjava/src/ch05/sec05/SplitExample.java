package ch05.sec05;

public class SplitExample {
	public static void main(String[] args) {
		String board = "1,자바학습,참조타입 String을 학습합니다.,홍길동";
		
		
		String[] arr = board.split(","); //String으로 담으려면 그것만 담을 수 있고 변경이 어렵다.
		
		//문자열 분리
//		String[] tokens = board.split(",");
		
		//인덱스별로 읽기
//		System.out.println("번호: " + tokens[0]);
//		System.out.println("제목: " + tokens[1]);
//		System.out.println("내용: " + tokens[2]);
//		System.out.println("쓴이: " + tokens[3]);
//		System.out.println("arr[0]:  " + arr[0]);
//		System.out.println("arr[1]:  " + arr[1]);
//		System.out.println("arr[2]:  " + arr[2]);
//		System.out.println("arr[3]:  " + arr[3]);
//		
//		System.out.println();
		
		//for문을 이용한 읽기
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	System.out.println("arr[].charat(0):" + arr[0]);
	}
}
