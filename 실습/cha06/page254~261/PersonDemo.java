package cha06_exercise;

// ������ ������ ��

class Person {
	int age;
	String name;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getPerson() {
		return this.name;
	}

	public void show() {
		System.out.printf("���[�̸� : %s, ���� : %d]\n", name, age);
	}
}

class Student extends Person {
	int id;

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public void show() {
		System.out.printf("�л�[�̸� : %s, ���� : %d, �й� : %d]\n", name, age, id);
	}
}

class ForeignStudent extends Student {
	String country;

	public ForeignStudent(String name, int age, int id, String country) {
		super(name, age, id);
		this.country = country;
	}

	public void show() {
		System.out.printf("�л�[�̸� : %s, ���� : %d, �й� : %d, ���� : %s]\n", name, age, id, country);
	}
}

public class PersonDemo {

	public static void main(String[] args) {
		Person[] p = { new Person("�浿��", 22), new Student("Ȳ����", 23, 100),
				new ForeignStudent("Amy", 30, 200, "U.S.A") };

		for (Person x : p) {
			x.show();
		}
	}

}
