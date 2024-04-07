package cha05_exercises;

import java.util.Scanner;

public class PrintDay {

	public static void main(String[] args) {
		String day;
		Scanner in = new Scanner(System.in);
		day = in.next().toUpperCase();
		
		Day weekday = Day.valueOf(day);
		dayReaction(weekday);
	}
	
	public static void dayReaction(Day day) {
		String reaction;
		
		switch(day) {
			case  MONDAY-> reaction = "�������� �ȴ�.";
			case  TUESDAY-> reaction = "ȭ������ ���� �׷���.";
			case  WEDNESDAY-> reaction = "�������� ���� �׷���.";
			case  THURSDAY-> reaction = "������� ���� �׷���.";
			case  FRIDAY-> reaction = "�ݿ����� ����.";
			case  SATURDAY-> reaction = "������� �ְ�.";
			case  SUNDAY-> reaction = "�Ͽ����� �ְ�.";
			default -> reaction = "�׷� ������ ����..";
		}
		
		System.out.println(reaction);
	}

}

enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
