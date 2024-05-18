package cha07_exercise;

abstract class Controller {
	boolean power;

	void show() {
		if (power)
			System.out.println(getName() + "�� �������ϴ�.");
		else
			System.out.println(getName() + "�� �������ϴ�.");
	}

	abstract String getName();
}

class TV extends Controller {
	TV(boolean onOff) {
		power = onOff;
	}

	String getName() {
		return "TV";
	}
}

class Radio extends Controller {
	Radio(boolean onOff) {
		power = onOff;
	}

	String getName() {
		return "����";
	}
}

public class ControllerTest {

	public static void main(String[] args) {
		Controller[] c = { new TV(false), new Radio(true) };

		for (Controller controller : c)
			controller.show();
	}

}
