package page80;

import java.util.Scanner;

public class Num_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = in.nextInt();
		boolean trueFlag = true, falseFlag = false;
		
		if (num % 4 == 0 && num % 5 == 0) {
			System.out.printf("%d은 4와 5 모두 나눠집니다. " + trueFlag, num);
		} else if (num % 4 == 0) {
			System.out.printf("%d은 4로 나눠집니다. " + trueFlag, num);
		} else if (num % 5 == 0) {
			System.out.printf("%d은 5로 나눠집니다. " + trueFlag, num);
		} else {
			System.out.printf("%d은 4또는 5로 나눌 수 없습니다. " + falseFlag, num);
		}

	}

}
