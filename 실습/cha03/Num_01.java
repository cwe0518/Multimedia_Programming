package cha03;

import java.util.Scanner;

public class Num_01 {

	public static void main(String[] args) {
		int result = 1, n;
		Scanner in = new Scanner(System.in);
		System.out.print("���丮�� ���� ���� ���� : ");
		n = in.nextInt();
		
		while(n > 0) {
			result *= n;
			n--;
		}
		
// ���ѷ����� ������ �ȴ�.		
//		while(true) {
//			result *= n;
//			n--;
//		}
		
		System.out.print(result);
	}

}
