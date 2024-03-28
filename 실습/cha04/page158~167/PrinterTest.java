package cha04_exercises;

class Printer{
	private int numOfPapers, left;
	private boolean duplex;
	
	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		
		
		if (duplex) {
			
			amount = amount%2==0 ? amount/2 : (amount/2)+1;
			
			if (numOfPapers == 0) {
				System.out.println("������ �����ϴ�.");
				
			} else if (numOfPapers < amount) {
				left = amount - numOfPapers;
				System.out.printf("��� ����Ϸ��� ������ %s�� �����մϴ�. %s�常 ����մϴ�.\n", left, numOfPapers);
				numOfPapers = 0;
			
			} else {
				System.out.printf("������� %s�� ����߽��ϴ�. ", amount);
				left = numOfPapers -= amount;
				System.out.printf("���� %s���� ���� �ֽ��ϴ�.\n", left); 
			}
			
		} else {
			
			if (numOfPapers == 0) {
				System.out.println("������ �����ϴ�.");
				
			} else if (numOfPapers < amount) {
				left = amount - numOfPapers;
				System.out.printf("�ܸ����� ��� ����Ϸ��� ������ %s�� �����մϴ�. %s�常 ����մϴ�.\n", left, numOfPapers);
				numOfPapers = 0;
			
			} else {
				System.out.printf("%s�� ����߽��ϴ�. ", amount);
				left = numOfPapers -= amount;
				System.out.printf("���� %s���� ���� �ֽ��ϴ�.\n", left); 
			}
		}
		
		
	}
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}

public class PrinterTest {

	public static void main(String[] args) {

		Printer p = new Printer(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}

}
