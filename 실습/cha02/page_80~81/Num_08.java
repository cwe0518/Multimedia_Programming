package page80;

import java.util.Scanner;

public class Num_08 {

	public static void main(String[] args) {
		
		int num, one, ten, hun, sum;
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		num = in.nextInt();
		
		one = num % 10;
		ten = (num / 10) % 10;
		hun = (num / 100);
		sum = one + ten + hun;
		System.out.printf("�� �ڸ����� �� = %d", sum);
	}

}
