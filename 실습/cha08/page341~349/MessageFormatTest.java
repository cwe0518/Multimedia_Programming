package cha08_exercise;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {
		Object[][] data = { { "�������", 1, "����" }, { "���ٸ�", 2, "�̱�" }, { "¡�⽺ĭ", 3, "����" } };

		String s;

		for (int i = 0; i < data.length; i++) {
			s = MessageFormat.format("�̸� : {0}   ��ȣ : {1}   ���� : {2}", data[i][0], data[i][1], data[i][2]);
			System.out.println(s);
		}

	}

}
