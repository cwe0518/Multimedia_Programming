package cha08_exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss");
		System.out.println(sdf1.format(c.getTime()));

		SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 M월의 d번째 날");
		System.out.println(sdf2.format(c.getTime()));

		SimpleDateFormat sdf3 = new SimpleDateFormat("오늘은 yyyy년의 " + c.get(Calendar.DAY_OF_YEAR) + "번째 날");
		System.out.println(sdf3.format(c.getTime()));
	}

}
