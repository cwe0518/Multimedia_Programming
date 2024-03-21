package page122;

import java.util.Scanner;

public class Num_07 {

	public static void main(String[] args) {
		String player1, player2;
		
		player1 = input("ö��");
		player2 = input("����");
		
		whosWin(player1, player2);
	}
	
	static String input(String player) {
		Scanner in = new Scanner(System.in);
		
		System.out.print(player + " : ");
		String choice = in.next();

		    while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
		        System.out.println(player + "�� r, s, p �� �ϳ��� �Է��ؾ� �մϴ�.");
		        choice = input(player);
		    }

		    return choice;
	}
	
	static void whosWin(String player1, String player2) {
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
			
		}
		
	}

}
