package cha04_exercises;

class Dice{
	int face;
	
	public int roll() {
		// 0~6������ ������ ���ϴ� ���
		face = (int)(Math.random() * 6) + 1;
		return face;
	}
}

public class DiceTest {

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("�ֻ����� ���� : " + d.roll());

	}

}
