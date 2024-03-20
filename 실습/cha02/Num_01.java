package cha02;

import java.util.Scanner;

public class Num_01 {

	public static void main(String[] args) {
		double w, h, a;
		
		Scanner in = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이를 입력하세요 : \n");
		w = in.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : \n");
		h = in.nextDouble();
		a = w * h;
		System.out.printf("직사각형의 넓이는 %f입니다.", a);
	}
}
