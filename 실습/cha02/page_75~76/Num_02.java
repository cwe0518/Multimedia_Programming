package cha02;

import java.util.Scanner;

public class Num_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = in.nextInt();
		
		String evenOrOdd;
		evenOrOdd = (num % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(evenOrOdd);
	}

}
