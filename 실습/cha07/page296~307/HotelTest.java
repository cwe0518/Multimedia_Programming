package cha07_exercise;

// Room Ŭ������ ��ø��Ű�� ����. ��ø�� ��� �ؾ� ������ �𸣰ڴ�..
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
				System.out.printf("%d�� ���� %s�� �����߽��ϴ�.\n", i, nameList[i]);
		}
	}
}

public class HotelTest {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "ȣ����");
		hotel.add(7, "�浿��");
		hotel.show();

	}

}
