package page80;

import java.util.Scanner;

public class Num_06 {

	public static void main(String[] args) {
		
		double f;
		
		Scanner in = new Scanner(System.in);
		System.out.print("ȭ���µ�(F)�� �Է��ϼ��� : ");
		f = in.nextDouble();
		System.out.printf("%f F�� %f C�Դϴ�.", f, (5.0/9.0)*(f-32));
	}

}
