package cha08_exercise;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {

	public static void main(String[] args) {
		String s;
		Car myCar = new Car("그랜저", "홍길동");
		Car yourCar = new Car("그랜저", "홍길동");

		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		s = MessageFormat.format("날짜: {0}, 자동차 모델=[{1}], 운전자({2})", sdf1.format(d), myCar.toString(), myCar.driver);

		StringTokenizer st = new StringTokenizer(s, " ,=[]()");

		if (myCar.equals(yourCar)) {
			System.out.printf("자동차 모델이 둘 다 [%s]로 동일하다.\n", myCar.toString());
			// System.out.println(s);

			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}

		} else {
			System.out.printf("내 자동차는 [%s], 너 자동차는 [%s]로 모델이 다르다.\n", myCar.toString(), yourCar.toString());
		}

	}

}
