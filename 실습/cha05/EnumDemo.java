package cha05;

public class EnumDemo {

	public static void main(String[] args) {
		Gender gender = Gender.FEMALE;
		if (gender == Gender.MALE)
			System.out.println(Gender.MALE + "는 병역 의무가 있다.");
		else
			System.out.println(Gender.FEMALE + "는 병역 의무가 없다.");
		
//		if(gender == Direction.SOUTH)
//			System.out.println(Direction.SOUTH + "는 누구?");
//		gender = 5;
//		다른 열거 타입 상수 목록과 비교할 수 없어 오류 발생
	}

}


//enum Gender { MALE, FEMALE }
//enum Direction { EAST, WEST, SOUTH, NORTH }