package cha05_exercises;

public class CountCharDemo {

	public static void main(String[] args) {
		System.out.println(countChar("test", 't'));
		System.out.println(countChar("pen pineapple apple pen", 'p'));
	}
	
	public static int countChar(String s, char c) {
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c)
				count++;
		}
		
		return count;
	}

}
