package cha08_exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EngProverbTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력 : ");
		String proverb = in.nextLine();

		StringTokenizer st = new StringTokenizer(proverb, " ,.");
		int tokenCount = st.countTokens();
		System.out.printf("단어 개수 : %d\n", tokenCount);

		String[] proverbTokens = new String[tokenCount];

		for (int i = 0; i < tokenCount; i++) {
			proverbTokens[i] = st.nextToken();
		}

		Arrays.sort(proverbTokens);
		System.out.print("정렬된 토큰 : ");

		for (String token : proverbTokens) {
			System.out.print(token + ", ");
		}

	}

}
