package page80;

import java.util.Scanner;

public class Num_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = in.nextInt();
		boolean trueFlag = true, falseFlag = false;
		
		if (num % 4 == 0 && num % 5 == 0) {
			System.out.printf("%d�� 4�� 5 ��� �������ϴ�. " + trueFlag, num);
		} else if (num % 4 == 0) {
			System.out.printf("%d�� 4�� �������ϴ�. " + trueFlag, num);
		} else if (num % 5 == 0) {
			System.out.printf("%d�� 5�� �������ϴ�. " + trueFlag, num);
		} else {
			System.out.printf("%d�� 4�Ǵ� 5�� ���� �� �����ϴ�. " + falseFlag, num);
		}

	}

}
