package page80;

import java.util.Scanner;

public class Num_06 {

	public static void main(String[] args) {
		
		double f;
		
		Scanner in = new Scanner(System.in);
		System.out.print("화씨온도(F)를 입력하세요 : ");
		f = in.nextDouble();
		System.out.printf("%f F는 %f C입니다.", f, (5.0/9.0)*(f-32));
	}

}
