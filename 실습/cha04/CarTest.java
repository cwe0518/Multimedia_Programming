package cha04_exercises;

class Car{
	String color;
	private static int NumOfCar, NumOfRedCar;
	
	public Car(String color) {
		this.color = color;
		
		if (color == "red" || color == "RED") {
			NumOfCar++; 
			NumOfRedCar++;
		} else {
			NumOfCar++;
		}
	}
	
	public static int getNumOfCar() {
		return NumOfCar;
	}
	
	public static int getNumOfRedCar() {
		return NumOfRedCar;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}
