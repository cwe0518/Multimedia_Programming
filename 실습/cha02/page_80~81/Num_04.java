package page80;

import java.util.Scanner;

public class Num_04 {

	public static void main(String[] args) {
		int time, h, m, s;
		
		Scanner in = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		time = in.nextInt();
		h = time / 3600;
		m = (time % 3600)/60;
		s = (time % 3600)%60;
		System.out.printf("%d�ð� %d�� %d��", h, m, s);
	}
}
