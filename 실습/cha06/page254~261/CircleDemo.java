package cha06_exercise;

class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	void show() {
		System.out.printf("반지름이 %d인 원이다.\n", radius);
	}
}

class ColoredCircle extends Circle {
	String color;

	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}

	void show() {
		System.out.printf("반지름이 %d인 %s 원이다.\n", radius, color);
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		ColoredCircle cc = new ColoredCircle(10, "빨간색");

		c.show();
		cc.show();
	}

}
