package cha04_exercises;

class GolfClub{
	int ironNum;
	String name;
	
	public void print() {
		if (name != null) {
			System.out.printf("%s입니다.\n", name);
		} else {
			System.out.printf("%d번 아이언입니다.\n", ironNum);
		}
	}
	
	public GolfClub() {
		ironNum = 7;
	}
	
	public GolfClub(int ironNum) {
		this.ironNum = ironNum;
	}

	public GolfClub(String name) {
		this.name = name;
	}
}

public class GolfClubTest {

	public static void main(String[] args) {
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();
		
		GolfClub g3 = new GolfClub("퍼터");
		g3.print();

	}

}
