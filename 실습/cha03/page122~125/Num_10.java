package page122;

import java.util.Scanner;

public class Num_10 {

	public static void main(String[] args) {
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num = new Scanner(System.in).nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		} else
			System.out.print(num + "�� �Ҽ��� �ƴմϴ�.");

	}

	static boolean isPrime(int n) {
		
		if(n <= 1) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
		
		return true;
		
	}
}
