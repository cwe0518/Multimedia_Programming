package cha03;

import java.util.Scanner;

public class Num_02 {

	public static void main(String[] args) {
		int result = 1, n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		
		result = factorial(n);
		System.out.print(result);
	}
	
	static int factorial(int x) {
		int r = 1;
		
		while(x > 0) {
			r *= x;
			x--;
		}
		
		return r;
	}

}
