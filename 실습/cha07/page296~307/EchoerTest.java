package cha07_exercise;

import java.util.Scanner;

abstract class Echoer {
	void start() {
		System.out.println("시작합니다.");
	}

	abstract void echo();

	void stop() {
		System.out.println("종료합니다.");
	}
}

public class EchoerTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Echoer e = new Echoer() {
			public void echo() {
				String str = "";

				while (!str.equals("끝")) {
					str = in.nextLine();
					System.out.println(str);
				}
			}
		};

		e.start();
		e.echo();
		e.stop();

	}

}
