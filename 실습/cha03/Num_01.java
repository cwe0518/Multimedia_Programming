package cha03;

import java.util.Scanner;

public class Num_01 {

	public static void main(String[] args) {
		int result = 1, n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		
		while(n > 0) {
			result *= n;
			n--;
		}
		
// 무한루프에 빠지게 된다.		
//		while(true) {
//			result *= n;
//			n--;
//		}
		
		System.out.print(result);
	}

}
