package cha03;

public class Num_03 {

	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(factorial(n));
		System.out.println(factorial(1,5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}
	
	static int factorial(int x) {
		int r = 1;
		
		while(x > 0) {
			r *= x;
			x--;
		}
		
		return r;
	}
	
	static int factorial(int x, int y) {
		int r = 1;
		
		  while (x <= y) {
		    r *= x;
		    x++;
		  }
		  return r;
	}

}
