package cha02;

import java.util.Scanner;

public class Num_01 {

	public static void main(String[] args) {
		double w, h, a;
		
		Scanner in = new Scanner(System.in);
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : \n");
		w = in.nextDouble();
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : \n");
		h = in.nextDouble();
		a = w * h;
		System.out.printf("���簢���� ���̴� %f�Դϴ�.", a);
	}
}
