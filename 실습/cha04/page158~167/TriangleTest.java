package cha04_exercises;

class Triangle{
	double width, height, area;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double findArea() {
		area = width * height * 0.5;
		return area;
	}
	
	public boolean isSameArea(Triangle t) {
		boolean isSame = findArea() == t.findArea() ? true : false;
		return isSame;
	}
	
	public double getTriangle() {
		return area;
	}
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
//		System.out.println(t.findArea());
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
