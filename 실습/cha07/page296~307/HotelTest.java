package cha07_exercise;

// Room 클래스를 중첩시키지 않음. 중첩을 어떻게 해야 좋을지 모르겠다..
class Hotel {
	String[] nameList = new String[10];

	void add(int roomNum, String name) {
		nameList[roomNum] = name;
	}

	void show() {
		for (int i = 1; i < nameList.length; i++) {
			if (nameList[i] == null)
				continue;
			else
				System.out.printf("%d번 방을 %s가 예약했습니다.\n", i, nameList[i]);
		}
	}
}

public class HotelTest {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.show();

	}

}
