package page80;

import java.util.Scanner;

public class Num_09 {

	public static void main(String[] args) {
		int major, ge, general, total;
		
		Scanner in = new Scanner(System.in);
		System.out.print("���� �̼� ���� : ");
		major = in.nextInt();
		
		System.out.print("���� �̼� ���� : ");
		ge = in.nextInt();
		
		System.out.print("�Ϲ� �̼� ���� : ");
		general = in.nextInt();
		
		total = major + ge + general;
		
		if (total >= 140) {
			if (major >= 70) {
				
				if ((ge >= 30 && general >= 30) || ge + general >= 80) {
				System.out.println("���� ����");
				} else {
				System.out.println("���� �Ұ���");
				}
				
			} else
				System.out.println("���� �Ұ���");
			
		} else
			System.out.println("���� �Ұ���");
	}
}
