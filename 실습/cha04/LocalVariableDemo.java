package cha04;

public class LocalVariableDemo {

	public static void main(String[] args) {
		int a = 0;
		double b;
		
		//System.out.print(b); 초기화되지 않아 사용X
		//System.out.print(a + c); 선언되지 않아 사용X
		
		int c = 0;
		
		//public double d = 0.0; 지역변수는 public 지정X
		
		for (int e = 0; e < 10; e++) {
			//int a += 1; 이미 선언된 이름. 다시 선언X
			System.out.print(e);
		}
	}

}
