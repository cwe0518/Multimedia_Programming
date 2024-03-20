package cha02;

import java.util.Scanner;

public class Num_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = in.nextInt();
		
		String evenOrOdd;
		evenOrOdd = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(evenOrOdd);
	}

}
