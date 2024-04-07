package cha05_exercises;

public class SumExceptFirstDemo {

	public static void main(String[] args) {
		System.out.println(sumExceptFirst(1, 2, 3, 4));
	}
	
	public static int sumExceptFirst(int... arr) {
		int sum = 0;
		
		for(int x : arr) {
			sum += x;
		}
		
		return sum;
	}

}
