package cha04_sec05;

public class CircleDemo2 {

	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);
		
		//print(); ���� �޼����̹Ƿ� �ν��Ͻ� �޼��� ȣ��X
		System.out.println("���� ���� : " + Circle.numOfCircles);
		System.out.println("���� ���� : " + yourCircle.numCircles);
		
	}
	
	void print() {
		System.out.println("�ν��Ͻ� �޼����Դϴ�.");
	}

}
