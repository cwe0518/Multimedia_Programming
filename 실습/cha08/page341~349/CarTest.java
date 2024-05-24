package cha08_exercise;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {

	public static void main(String[] args) {
		String s;
		Car myCar = new Car("�׷���", "ȫ�浿");
		Car yourCar = new Car("�׷���", "ȫ�浿");

		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		s = MessageFormat.format("��¥: {0}, �ڵ��� ��=[{1}], ������({2})", sdf1.format(d), myCar.toString(), myCar.driver);

		StringTokenizer st = new StringTokenizer(s, " ,=[]()");

		if (myCar.equals(yourCar)) {
			System.out.printf("�ڵ��� ���� �� �� [%s]�� �����ϴ�.\n", myCar.toString());
			// System.out.println(s);

			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}

		} else {
			System.out.printf("�� �ڵ����� [%s], �� �ڵ����� [%s]�� ���� �ٸ���.\n", myCar.toString(), yourCar.toString());
		}

	}

}
