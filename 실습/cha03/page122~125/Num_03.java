package page122;

import java.util.Scanner;

public class Num_03 {

	public static void main(String[] args) {
		int n, total = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("���� ������ �Է��ϼ��� : ");
			n = in.nextInt();
			
			if(n < 0) {
				break;
				
			} else if (n % 2 ==0) {
				total += n;
			}
			
		} while(true);
		
		System.out.print("�Է��� ���� ���� �߿��� ¦���� ���� " + total);
		
	}

}
