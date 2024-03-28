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
				System.out.println("용지가 없습니다.");
				
			} else if (numOfPapers < amount) {
				left = amount - numOfPapers;
				System.out.printf("모두 출력하려면 용지가 %s매 부족합니다. %s장만 출력합니다.\n", left, numOfPapers);
				numOfPapers = 0;
			
			} else {
				System.out.printf("양면으로 %s장 출력했습니다. ", amount);
				left = numOfPapers -= amount;
				System.out.printf("현재 %s장이 남아 있습니다.\n", left); 
			}
			
		} else {
			
			if (numOfPapers == 0) {
				System.out.println("용지가 없습니다.");
				
			} else if (numOfPapers < amount) {
				left = amount - numOfPapers;
				System.out.printf("단면으로 모두 출력하려면 용지가 %s매 부족합니다. %s장만 출력합니다.\n", left, numOfPapers);
				numOfPapers = 0;
			
			} else {
				System.out.printf("%s장 출력했습니다. ", amount);
				left = numOfPapers -= amount;
				System.out.printf("현재 %s장이 남아 있습니다.\n", left); 
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
