package page80;

import java.util.Scanner;

public class Num_09 {

	public static void main(String[] args) {
		int major, ge, general, total;
		
		Scanner in = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		major = in.nextInt();
		
		System.out.print("교양 이수 학점 : ");
		ge = in.nextInt();
		
		System.out.print("일반 이수 학점 : ");
		general = in.nextInt();
		
		total = major + ge + general;
		
		if (total >= 140) {
			if (major >= 70) {
				
				if ((ge >= 30 && general >= 30) || ge + general >= 80) {
				System.out.println("졸업 가능");
				} else {
				System.out.println("졸업 불가능");
				}
				
			} else
				System.out.println("졸업 불가능");
			
		} else
			System.out.println("졸업 불가능");
	}
}
