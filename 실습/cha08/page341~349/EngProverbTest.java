package cha08_exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EngProverbTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�Է� : ");
		String proverb = in.nextLine();

		StringTokenizer st = new StringTokenizer(proverb, " ,.");
		int tokenCount = st.countTokens();
		System.out.printf("�ܾ� ���� : %d\n", tokenCount);

		String[] proverbTokens = new String[tokenCount];

		for (int i = 0; i < tokenCount; i++) {
			proverbTokens[i] = st.nextToken();
		}

		Arrays.sort(proverbTokens);
		System.out.print("���ĵ� ��ū : ");

		for (String token : proverbTokens) {
			System.out.print(token + ", ");
		}

	}

}
