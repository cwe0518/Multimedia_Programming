package page122;

import java.util.Scanner;

public class Num_02 {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("����� �Է��ϼ��� : ");
		n = in.nextInt();
		
		switch(n) {
		case 1 -> System.out.println("���� ���߽��ϴ�.");
		case 2,3 -> System.out.println("���߽��ϴ�.");
		case 4,5,6 -> System.out.println("�����Դϴ�.");
		default -> System.out.println("����ؾ߰ڽ��ϴ�.");
		}
	}

}
