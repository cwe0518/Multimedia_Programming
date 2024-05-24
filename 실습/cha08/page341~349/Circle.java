package cha08_exercise;

public class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle other = (Circle) obj;
			return this.getRadius() == other.getRadius();
		}
		return false;
	}
}
