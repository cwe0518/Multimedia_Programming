package cha04;

public class TestDemo {

	public static void main(String[] args) {
		Student st1 = new Student("¿µÈñ", 90, 80, 60);
		System.out.printf("%s ÃÑÁ¡Àº %d Æò±Õ %f", st1.name, st1.getTotal(), st1.getAverage());
	}

}
