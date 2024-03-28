package cha04_sec05;

public class Circle {
	double radius;
	static int numOfCircles = 0;
	int numCircles = 0;
	
	public Circle(double radius) {
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
}
