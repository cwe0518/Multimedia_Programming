package cha05;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		
		String s1, temp = "";
		int length;
		
		Scanner in = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		s1 = in.next();
		length = s1.length();
		
//		while(length > 0) {
//			temp += s1.substring(length-1, length);
//			length--;
//		}
		
		for(int i = length-1; i>=0; i--) {
			temp += s1.charAt(i);
		}

		System.out.println(temp);
	}

}
