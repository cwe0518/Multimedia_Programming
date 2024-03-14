package page80;

import java.util.Scanner;

public class Num_03 {

	public static void main(String[] args) {
		double r, h, pi = 3.14;
		
		Scanner in = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		r = in.nextInt();
		System.out.print("원기둥의 높이는? ");
		h = in.nextInt();
		System.out.printf("원기둥의 부피는 %f", pi*r*r*h);

	}

}
