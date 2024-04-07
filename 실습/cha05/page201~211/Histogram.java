package cha05_exercises;

import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int[] histogram = new int[10];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("숫자를 10개 입력하세요.");
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
			
			if(numbers[i] >= 0 && numbers[i] < 100)
				histogram[numbers[i] / 10]++;
		}
			
		
		for (int i = 0; i < histogram.length; i++) {
            System.out.printf("%2d-%2d: ", i * 10, (i + 1) * 10 - 1);

            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
		}
	     
	}

}
