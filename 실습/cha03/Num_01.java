package page122;

import java.util.Scanner;

public class Num_01 {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		n = in.nextInt();
		
		if (n > 19) {
			System.out.print("����");
		} else {
			System.out.print("�̼���");
		}

	}

}
