package page80;

import java.util.Scanner;

public class Num_03 {

	public static void main(String[] args) {
		double r, h, pi = 3.14;
		
		Scanner in = new Scanner(System.in);
		System.out.print("������� �ظ� ��������? ");
		r = in.nextInt();
		System.out.print("������� ���̴�? ");
		h = in.nextInt();
		System.out.printf("������� ���Ǵ� %f", pi*r*r*h);

	}

}
