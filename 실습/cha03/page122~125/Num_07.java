package page122;

import java.util.Scanner;

public class Num_07 {

	public static void main(String[] args) {
		String player1, player2;
		
		player1 = input("Ã¶¼ö");
		player2 = input("¿µÈñ");
		
		whosWin(player1, player2);
	}
	
	static String input(String player) {
		Scanner in = new Scanner(System.in);
		
		System.out.print(player + " : ");
		String choice = in.next();

		    while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
		        System.out.println(player + "´Â r, s, p Áß ÇÏ³ª¸¦ ÀÔ·ÂÇØ¾ß ÇÕ´Ï´Ù.");
		        choice = input(player);
		    }

		    return choice;
	}
	
	static void whosWin(String player1, String player2) {
		if(player1.equals("r")) {
			
			switch(player2) {
			case "r" -> System.out.print("¹«½ÂºÎ!");
			case "s" -> System.out.print("Ã¶¼ö ½Â!");
			case "p" -> System.out.print("¿µÈñ ½Â!");
			}
			
		} else if(player1.equals("s")) {
			
			switch(player2) {
			case "r" -> System.out.print("¿µÈñ ½Â!");
			case "s" -> System.out.print("¹«½ÂºÎ!");
			case "p" -> System.out.print("Ã¶¼ö ½Â!");
			}
			
		} else if(player1.equals("p")) {
			
			switch(player2) {
			case "r" -> System.out.print("Ã¶¼ö ½Â!");
			case "s" -> System.out.print("¿µÈñ ½Â!");
			case "p" -> System.out.print("¹«½ÂºÎ!");
			}
			
		}
		
	}

}
