package cha09_exercise;

class Shape{}

class Rectangle extends Shape{}

class Circle extends Shape{}

public class CastExceptionTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		try {
			casting(r);
		} catch(ClassCastException e) {
			System.out.println("형변환 오류가 발생했습니다.");
		}
	}
	
	static void casting(Shape s) {
		Circle c = (Circle) s;
	}

}
