package ch04.sec08;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ✔️ scanner 선언

        while(true) {
        System.out.println("==============================================");
        System.out.println("             [숫자맞추기게임 시작]                  ");
        System.out.println("==============================================");
       
        Integer random = (int) (Math.random()* 5) + 1 ; //문자열을 정수값으로 변환
        Integer answer = 0;
        //숫자를 입력하는 콘솔창 등장
      
        //1~100까지 숫자가                                                                                                                                                                                             랜덤으로 결정된다.

        
        //while 조건 생성시, 랜덤이 아닌 경우로 설정해야 반복되겠지
        while (!answer.equals(random)) {
        	System.out.print(">>");
        	answer = scanner.nextInt();
        	if (answer<random) {
        		System.out.println("높음");
        	} else if (answer > random) {
        			System.out.println("낮음");
        	}else {System.out.println("정답!");
        	break;	
        	}
        	
        	}
        	System.out.print("게임을 종료하시겠습니까? (y/n)>>");
        	String retry = scanner.next();
        	
        	if (retry.equals("n")) {
        		continue;
        	}else if  (retry.equals("y"))  	
        		break;  }
    	System.out.println("==============================================");
    	System.out.println("             [숫자맞추기게임 종료]                  ");
    	System.out.println("==============================================");
  }
}

//        
//  }
        
        
        
        
        
        //While 구문 사용하여 if 문 활용하여 더 높게, 더 낮게 만약에 맞으면
        //"맞았습니다. (줄바꿈) 게임을 종료하시겠습니까? (y/n) >> 콘솔창.으로 입력
        //1) y일 경우 
       
        ///System.out.println("==============================================");
        ///System.out.println("             [숫자맞추기게임 종료]                  ");
        ///System.out.println("==============================================");
        
        
        //2) n일 경우 
        //               다시 처음부터 랜덤
        
    