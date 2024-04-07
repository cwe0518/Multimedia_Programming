package cha05_exercises;

public class DirectionDemo {

	public static void main(String[] args) {
		
		for(Direction d : Direction.values()) {
			System.out.print(d + " ");
		}
	}

}

enum Direction{
	EAST("��"),
	WEST("��"),
	SOUTH("��"),
	NORTH("��");
	
	private String way;
	
	private Direction(String way) {
		this.way = way;
	}
	
	public String toString() {
		return way;
	}
}
