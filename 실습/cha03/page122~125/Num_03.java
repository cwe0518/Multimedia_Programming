package page122;

import java.util.Scanner;

public class Num_03 {

	public static void main(String[] args) {
		int n, total = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			n = in.nextInt();
			
			if(n < 0) {
				break;
				
			} else if (n % 2 ==0) {
				total += n;
			}
			
		} while(true);
		
		System.out.print("입력한 양의 정수 중에서 짝수의 합은 " + total);
		
	}

}
