package page80;

import java.util.Scanner;

public class Num_04 {

	public static void main(String[] args) {
		int time, h, m, s;
		
		Scanner in = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		time = in.nextInt();
		h = time / 3600;
		m = (time % 3600)/60;
		s = (time % 3600)%60;
		System.out.printf("%d시간 %d분 %d초", h, m, s);
	}
}
