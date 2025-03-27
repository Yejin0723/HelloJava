package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		// x = -x;
		
		x++;  // x = x +1;
		++x;
		System.out.println("x=" + x);		

		System.out.println("-----------------------");		
		y--;
		--y;
		System.out.println("y=" + y);		

		System.out.println("-----------------------");		
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");				
		z = ++x + y++; //==x를 수행 후, y값을 더한 뒤에 z에 넣고 y++을 진행
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
