package cha04_exercises;

class Line{
	int length;
	
	public Line(int length) {
		this.length = length;
	}
	
	public boolean isSameLine(Line line) {
		return length == line.length ? true : false;
	}
}

public class LineTest {

	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);

		System.out.println(a.isSameLine(b));
		System.out.println(a == b);
	}

}
