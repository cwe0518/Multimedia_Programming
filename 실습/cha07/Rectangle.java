package cha07;

public class Rectangle extends Shape {
	int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("�簢���� �׸���.");
	}

	public double findArea() {
		return width * height;
	}
}
