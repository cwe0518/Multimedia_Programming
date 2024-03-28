package cha04_sec05;

public class CircleDemo2 {

	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);
		
		//print(); 정적 메서드이므로 인스턴스 메서드 호출X
		System.out.println("원의 개수 : " + Circle.numOfCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
		
	}
	
	void print() {
		System.out.println("인스턴스 메서드입니다.");
	}

}
