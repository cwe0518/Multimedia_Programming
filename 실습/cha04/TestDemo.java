package cha04;

public class TestDemo {

	public static void main(String[] args) {
		Student st1 = new Student("����", 90, 80, 60);
		System.out.printf("%s ������ %d ��� %f", st1.name, st1.getTotal(), st1.getAverage());
	}

}
