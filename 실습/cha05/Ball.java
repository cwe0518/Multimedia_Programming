package cha06;

public class Ball extends Circle {
	private String color;

	public Ball(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + " ���̴�.");
	}

	@Override
	public void findArea() {
		System.out.println("���̴� (PI*������*������)�̴�.");
	}

	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(PI*������*������*������)�̴�.");
	}
}
