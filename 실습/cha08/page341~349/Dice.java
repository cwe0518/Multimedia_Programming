package cha08_exercise;

public class Dice {
	private double num;

	public int roll() {
		num = Math.random() * 6 + 1;

		return (int) num;
	}
}
