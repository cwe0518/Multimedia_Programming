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
			case  MONDAY-> reaction = "월요일은 싫다.";
			case  TUESDAY-> reaction = "화요일은 그저 그렇다.";
			case  WEDNESDAY-> reaction = "수요일은 그저 그렇다.";
			case  THURSDAY-> reaction = "목요일은 그저 그렇다.";
			case  FRIDAY-> reaction = "금요일은 좋다.";
			case  SATURDAY-> reaction = "토요일은 최고.";
			case  SUNDAY-> reaction = "일요일은 최고.";
			default -> reaction = "그런 요일은 없어..";
		}
		
		System.out.println(reaction);
	}

}

enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
