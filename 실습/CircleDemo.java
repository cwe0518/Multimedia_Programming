package cha04;

class Circle {
	double radius;
	String color;
	
	public Circle(double r, String c){
		radius = r;
		color = c;
	}
	
	public Circle(double r){
		radius = r;
		color = "�Ķ�";
	}
	
	public Circle(String c){
		radius = 10.0;
		color = c;
	}
	
	public Circle(){
		radius = 10.0;
		color = "����";
	}
	
//	public double getRadius(){
//		return radius;
//	}
//	
//	public void setRadius(double r){
//		this.radius = r;
//	}
//	
//	double findArea() {
//		return 3.14 * radius * radius;
//	}
//	
//	void show(double x, double y) {
//		System.out.printf("������ = %.1f, ���� = %.1f\n", x, y);
//	}
}

public class CircleDemo {

	public static void main(String[] args) {
//		Circle myCircle = new Circle();
//		myCircle.radius = 10.0;
//		myCircle.show(myCircle.radius, myCircle.findArea());
	
//		Circle myCircle2 = new Circle();
//		myCircle2.setRadius(10.0);
//		myCircle2.show(myCircle2.getRadius(), myCircle2.findArea());

//		Circle myCircle3 = new Circle();
//		����Ʈ �����ڰ� �����Ƿ� ���X
		
		Circle c1 = new Circle(10.0, "����");
		Circle c2 = new Circle(5.0);
		Circle c3 = new Circle("���");
		Circle c4 = new Circle();
//		������� ������ 1,2,3,4 ȣ��
	}

}
