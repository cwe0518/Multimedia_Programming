package cha05_exercises;

import java.util.Scanner;

public class CheckURL {

	public static void main(String[] args) {
		String url, endsWithResult, containsResult;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("URL�� �Է��ϼ��� : ");
			url = in.next();
			
			if(url.equals("bye")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
				
			
			endsWithResult = 
				url.endsWith("com") ? "�� 'com'���� �����ϴ�." : "�� 'com'���� ������ �ʽ��ϴ�.";
			System.out.println(url + "�� " + endsWithResult);
			
			containsResult = 
					url.contains("java") ? "�� 'java'�� �����մϴ�." : "�� 'java'�� �������� �ʽ��ϴ�.";
			System.out.println(url + containsResult);
			
		}
		
	}

}
