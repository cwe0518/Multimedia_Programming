package cha07_exercise;

interface Talkable {
	void talk();
}

class Korean implements Talkable {
	public void talk() {
		System.out.println("æ»≥Á«œººø‰!");
	}
}

class American implements Talkable {
	public void talk() {
		System.out.println("Hello!");
	}
}

public class TalkableTest {

	static void speak(Talkable lang) {
		lang.talk();
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}

}
