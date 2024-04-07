package cha05_exercises;

public class Reverse {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(reverse(arr)[i] + " ");
		}

	}
	
	public static int[] reverse(int[] org) {
		int[] reverseArr = new int[org.length];
		
		for (int i = 0; i < org.length; i++) {
			reverseArr[i] = org[org.length -1 - i];
		}
		
		return reverseArr;
	}

}
