package cha05_exercises;

import java.util.Scanner;

public class CheckURL {

	public static void main(String[] args) {
		String url, endsWithResult, containsResult;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("URL을 입력하세요 : ");
			url = in.next();
			
			if(url.equals("bye")) {
				System.out.println("종료되었습니다.");
				break;
			}
				
			
			endsWithResult = 
				url.endsWith("com") ? "은 'com'으로 끝납니다." : "은 'com'으로 끝나지 않습니다.";
			System.out.println(url + "은 " + endsWithResult);
			
			containsResult = 
					url.contains("java") ? "은 'java'를 포함합니다." : "은 'java'를 포함하지 않습니다.";
			System.out.println(url + containsResult);
			
		}
		
	}

}
