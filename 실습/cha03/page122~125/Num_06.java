package page122;

import java.util.Scanner;

public class Num_06 {

	public static void main(String[] args) {
		String player1, player2;
		Scanner in = new Scanner(System.in);
		System.out.print("Ã¶¼ö : ");
		player1 = in.next();
		System.out.print("¿µÈñ : ");
		player2 = in.next();
		
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
			
		} else 
			System.out.print("¿Ã¹Ù¸¥ ¹®ÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
	}

}
