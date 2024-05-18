package cha07_exercise;

interface Human {
	void eat();

	default void print() {
		System.out.println("�ΰ��Դϴ�.");
	}

	static void echo() {
		System.out.println("��ȣ!!!");
	}
}

class Worker implements Human {
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
}

class Student implements Human {
	int age;

	public Student(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");
	}

	public void print() {
		System.out.printf("%d���� �л��Դϴ�.\n", age);
	}
}

public class HumanTest {

	public static void main(String[] args) {
		Human.echo();

		Student s = new Student(20);
		s.print();
		s.eat();

		Human p = new Worker();
		p.print();
		p.eat();
	}

}
