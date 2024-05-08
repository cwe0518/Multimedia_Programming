package cha06_exercise;

class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	void show() {
		System.out.printf("�������� %d�� ���̴�.\n", radius);
	}
}

class ColoredCircle extends Circle {
	String color;

	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}

	void show() {
		System.out.printf("�������� %d�� %s ���̴�.\n", radius, color);
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		ColoredCircle cc = new ColoredCircle(10, "������");

		c.show();
		cc.show();
	}

}
