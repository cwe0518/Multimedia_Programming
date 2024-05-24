package cha08_exercise;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		String[] weekName = { "��", "��", "ȭ", "��", "��", "��", "��" };
		String[] noonName = { "����", "����" };
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int weekNum = c.get(Calendar.DAY_OF_WEEK) - 1;
		String week = weekName[weekNum];
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int noonNum = c.get(Calendar.AM_PM);
		String noon = noonName[noonNum];

		System.out.println(year + "�� " + month + "�� " + day + "�� ");
		System.out.println(week + "���� " + noon);
		System.out.println(hour + "�� " + minute + "�� " + second + "�� ");

	}

}
