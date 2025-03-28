package ch04.sec08;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ✔️ scanner 선언

        System.out.println("숫자를 입력하세요: ");
        int num = scanner.nextInt();  
        int total = 0;// ✔️ 이제 사용 가능

        
        //if 함수를 사용하여 나머지가 1 또는 0일 때 결과값의 합을 구해야한다.
        if (num % 2 == 0) {
        	for(int i = 2; i <= num; i+=2) {
        		total += i;
        	}
        //	System.out.println("결과값 :  " + total);
        } else{
        	for(int i = 1; i <= num; i+=2) {
    		total += i;
    	}
    //	System.out.println("결과값 :  " + total);
        }
        System.out.println("결과값 :  " + total);
    }
}  
