package cha06_exercise;

// 접근자 만들어야 함

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		String coords = x + "," + y;
		return coords;
	}
}

class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString() {
		String speed = xSpeed + "," + ySpeed;
		super.toString();
		return speed;
	}
}

public class PointDemo {

	public static void main(String[] args) {
		Point p = new Point(0, 5);
		MovablePoint mp = new MovablePoint(1, 2, 30, 20);

		System.out.println(p.toString());
		System.out.println(mp.toString());
	}

}
