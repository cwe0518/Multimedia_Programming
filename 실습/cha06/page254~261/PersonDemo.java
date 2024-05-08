package cha06_exercise;

// 접근자 만들어야 함

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
		System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
	}
}

class Student extends Person {
	int id;

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public void show() {
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, id);
	}
}

class ForeignStudent extends Student {
	String country;

	public ForeignStudent(String name, int age, int id, String country) {
		super(name, age, id);
		this.country = country;
	}

	public void show() {
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", name, age, id, country);
	}
}

public class PersonDemo {

	public static void main(String[] args) {
		Person[] p = { new Person("길동이", 22), new Student("황진이", 23, 100),
				new ForeignStudent("Amy", 30, 200, "U.S.A") };

		for (Person x : p) {
			x.show();
		}
	}

}
