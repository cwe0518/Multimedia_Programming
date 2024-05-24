package cha08_exercise;

public class Car {
	private String model;
	public String driver;

	public Car(String model, String driver) {
		this.model = model;
		this.driver = driver;
	}

	public String toString() {
		return model;
	}

	public boolean equals(Object obj) {
		if (model.equals(obj.toString()))
			return true;
		else
			return false;
	}
}
