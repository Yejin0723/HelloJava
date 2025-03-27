package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) { //01.부터 1.0까지다 0.1씩 증가하네.
			System.out.println(x);
		}
	}
}
