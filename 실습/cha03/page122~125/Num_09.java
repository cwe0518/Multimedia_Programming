package page122;

public class Num_09 {

	public static void main(String[] args) {
		foo("æ»≥Á", 1);
		foo("æ»≥Á«œººø‰", 1, 2);
		foo("¿ﬂ ¿÷æÓ");
	}
	
	static void foo(String str) {
		System.out.println(str);
	}
	
	static void foo(String str, int x) {
		System.out.println(str + " " + x);
	}

	static void foo(String str, int x, int y) {
		System.out.println(str + " " + x + " " + y);
	}

}
