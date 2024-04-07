package cha05_exercises;

import java.util.Scanner;

public class GradePrinter {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		
		System.out.print("학생 수? ");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for(int i = 0; i < numOfStudents; i++) {
			scores[i] = in.nextInt();
		}
		
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for(int score : scores) {
			System.out.print(score + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < numOfStudents; i++) {
			if(scores[i] >= 90) {
				System.out.println((i+1) + "번 학생의 등급은 " + Grades.A + "입니다.");
				
			} else if (scores[i] >= 80) {
				System.out.println((i+1) + "번 학생의 등급은 " + Grades.B + "입니다.");
				
			} else if (scores[i] >= 70) {
				System.out.println((i+1) + "번 학생의 등급은 " + Grades.C + "입니다.");
				
			} else if (scores[i] >= 60) {
				System.out.println((i+1) + "번 학생의 등급은 " + Grades.D + "입니다.");
				
			} else
				System.out.println((i+1) + "번 학생의 등급은 " + Grades.E + "입니다.");
			
		}
		
	}
	
	enum Grades{
		A("최우수"), 
		B("우수"), 
		C("보통"), 
		D("미흡"), 
		E("탈락");
		
		private String grade;
		
		Grades(String grade) {
			this.grade = grade;
		}
		
		public String toString() {
			return grade;
		}
	}

}
