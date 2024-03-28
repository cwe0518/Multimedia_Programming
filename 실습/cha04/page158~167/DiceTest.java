package cha04_exercises;

class Dice{
	int face;
	
	public int roll() {
		// 0~6사이의 난수를 구하는 방법
		face = (int)(Math.random() * 6) + 1;
		return face;
	}
}

public class DiceTest {

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());

	}

}
