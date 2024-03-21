package page122;

import java.util.Scanner;

public class Num_01 {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		n = in.nextInt();
		
		if (n > 19) {
			System.out.print("성년");
		} else {
			System.out.print("미성년");
		}

	}

}
