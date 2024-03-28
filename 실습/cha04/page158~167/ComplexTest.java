package cha04_exercises;

class Complex{
	double num, num2 = 0.0;
	
	public Complex(double num) {
		this.num = num;
	}
	
	public Complex(double num, double num2) {
		this.num = num;
		this.num2 = num2;
	}
	
	public void print() {
		System.out.printf("%.1f + %.1fi\n", num, num2);
	}
}

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);
		c1.print();
		Complex c2 = new Complex(1.5, 2.5);
		c2.print();
	}

}
