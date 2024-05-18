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
		System.out.printf("%d마리 %s가 날아간다.\n", num, name);
	}

	public void count() {
		System.out.printf("%s가 %d마리 있다.\n", name, num);
	}
}

class Tree extends Countable {
	public Tree(String name, int num) {
		super(name, num);
	}

	void ripen() {
		System.out.printf("%d그루 %s에 열매가 잘 익었다.\n", num, name);
	}

	public void count() {
		System.out.printf("%s가 %d그루 있다.\n", name, num);
	}
}

public class CountableTest {

	public static void main(String[] args) {
		Countable[] m = { new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7) };

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
