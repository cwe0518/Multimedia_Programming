package cha05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int data, sum = 0;
		
		while((data = in.nextInt()) >= 0)
			scores.add(data);
		
		for(int i = 0; i < scores.size(); i++)
			sum += scores.get(i);
		
		
		System.out.println("Æò±Õ = " + (double)sum / scores.size());
	}

}
