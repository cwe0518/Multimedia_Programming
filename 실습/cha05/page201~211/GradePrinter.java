package cha05_exercises;

import java.util.Scanner;

public class GradePrinter {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		
		System.out.print("�л� ��? ");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		
		System.out.println(numOfStudents + "���� �л� ������ �Է��ϼ���.");
		for(int i = 0; i < numOfStudents; i++) {
			scores[i] = in.nextInt();
		}
		
		System.out.println(numOfStudents + "���� �л� ������ ������ �����ϴ�.");
		for(int score : scores) {
			System.out.print(score + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < numOfStudents; i++) {
			if(scores[i] >= 90) {
				System.out.println((i+1) + "�� �л��� ����� " + Grades.A + "�Դϴ�.");
				
			} else if (scores[i] >= 80) {
				System.out.println((i+1) + "�� �л��� ����� " + Grades.B + "�Դϴ�.");
				
			} else if (scores[i] >= 70) {
				System.out.println((i+1) + "�� �л��� ����� " + Grades.C + "�Դϴ�.");
				
			} else if (scores[i] >= 60) {
				System.out.println((i+1) + "�� �л��� ����� " + Grades.D + "�Դϴ�.");
				
			} else
				System.out.println((i+1) + "�� �л��� ����� " + Grades.E + "�Դϴ�.");
			
		}
		
	}
	
	enum Grades{
		A("�ֿ��"), 
		B("���"), 
		C("����"), 
		D("����"), 
		E("Ż��");
		
		private String grade;
		
		Grades(String grade) {
			this.grade = grade;
		}
		
		public String toString() {
			return grade;
		}
	}

}
