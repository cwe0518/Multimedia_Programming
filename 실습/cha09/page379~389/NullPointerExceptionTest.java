package cha09_exercise;

class MyDate{
	int year, month, day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}

public class NullPointerExceptionTest {

	public static void main(String[] args) {
		//MyDate d = null;
		MyDate d = new MyDate(2023, 12, 25);
		
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
	}

}
