package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		int[] arr1; 		//배열 변수 arr1 선언
		int[] arr2;		 	//배열 변수 arr2 선언
		int[] arr3; 		//배열 변수 arr3 선언
		
		arr1 = new int[] { 1, 2, 3 }; 	//배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
		arr2 = new int[] { 1, 2, 3 }; 	//배열 { 1, 2, 3 }을 생성하고 arr2 변수에 대입
		arr2 = arr1;
		arr3 = arr2;						//배열 변수 arr2의 값을 배열 변수 arr3에 대입
	
		System.out.println(arr1 == arr2); 	//arr1과 arr2 변수 값이 동일한 번지인지 검사
		System.out.println(arr2 == arr3);	//arr2와 arr3 변수가 같은 배열을 참조하는지 검사

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3); //참조형 객체들은 반드시 new로 초기화 해줘야함.		
	
	}
}

