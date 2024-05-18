package cha07_exercise;

import java.util.Arrays;

class Books {
	int price;

	Books(int price) {
		this.price = price;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Books[] b = { new Books(15000), new Books(50000), new Books(20000) };
		int[] booksPrice = new int[3];

		System.out.println("정렬 전");
		for (int i = 0; i < b.length; i++) {
			System.out.printf("Book [price=%d]\n", b[i].price);
			booksPrice[i] = b[i].price;
		}

		System.out.println("정렬 후");
		Arrays.sort(booksPrice);
		for (int bp : booksPrice) {
			System.out.printf("Book [price=%d]\n", bp);
		}
	}

}
