package cha06_exercise;

class Vehicle {
	String color;
	int speed;

	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	void show() {
		System.out.println(color);
		System.out.println(speed);
	}
}

class Car extends Vehicle {
	int displacement, gears;

	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	void show() {
		System.out.println(displacement);
		System.out.println(gears);
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("ÆÄ¶û", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v = c;
		v.show();

	}

}
