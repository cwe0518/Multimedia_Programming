package cha07_exercise;

//interface Countable {
//	void count();
//}

abstract class Countable {
	protected String name;
	protected int num;

	Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}

	abstract void count();
}

class Bird extends Countable {
	public Bird(String name, int num) {
		super(name, num);
	}

	void fly() {
		System.out.printf("%d���� %s�� ���ư���.\n", num, name);
	}

	public void count() {
		System.out.printf("%s�� %d���� �ִ�.\n", name, num);
	}
}

class Tree extends Countable {
	public Tree(String name, int num) {
		super(name, num);
	}

	void ripen() {
		System.out.printf("%d�׷� %s�� ���Ű� �� �;���.\n", num, name);
	}

	public void count() {
		System.out.printf("%s�� %d�׷� �ִ�.\n", name, num);
	}
}

public class CountableTest {

	public static void main(String[] args) {
		Countable[] m = { new Bird("���ٱ�", 5), new Bird("������", 2), new Tree("�������", 10), new Tree("�㳪��", 7) };

		for (Countable e : m)
			e.count();

		for (int i = 0; i < m.length; i++) {
			if (m[i] instanceof Bird)
				((Bird) m[i]).fly();
			else
				((Tree) m[i]).ripen();
		}
	}

}
