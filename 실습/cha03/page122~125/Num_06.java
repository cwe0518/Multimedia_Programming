package page122;

import java.util.Scanner;

public class Num_06 {

	public static void main(String[] args) {
		String player1, player2;
		Scanner in = new Scanner(System.in);
		System.out.print("ö�� : ");
		player1 = in.next();
		System.out.print("���� : ");
		player2 = in.next();
		
		if(player1.equals("r")) {
			
			switch(player2) {
			case "r" -> System.out.print("���º�!");
			case "s" -> System.out.print("ö�� ��!");
			case "p" -> System.out.print("���� ��!");
			}
			
		} else if(player1.equals("s")) {
			
			switch(player2) {
			case "r" -> System.out.print("���� ��!");
			case "s" -> System.out.print("���º�!");
			case "p" -> System.out.print("ö�� ��!");
			}
			
		} else if(player1.equals("p")) {
			
			switch(player2) {
			case "r" -> System.out.print("ö�� ��!");
			case "s" -> System.out.print("���� ��!");
			case "p" -> System.out.print("���º�!");
			}
			
		} else 
			System.out.print("�ùٸ� ���ڸ� �Է��ϼ���.");
	}

}
