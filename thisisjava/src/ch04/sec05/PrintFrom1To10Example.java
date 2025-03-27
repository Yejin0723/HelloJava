package ch04.sec05;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i++;
		}  //ctrl+/입력하면 주석 생김
		System.out.println ("");
		System.out.println ("----------------------");
		
		for(i=1;i<=10;i++) {
			System.out.print(i + " ");
		}
	}
}
