package cha04;

public class LocalVariableDemo {

	public static void main(String[] args) {
		int a = 0;
		double b;
		
		//System.out.print(b); �ʱ�ȭ���� �ʾ� ���X
		//System.out.print(a + c); ������� �ʾ� ���X
		
		int c = 0;
		
		//public double d = 0.0; ���������� public ����X
		
		for (int e = 0; e < 10; e++) {
			//int a += 1; �̹� ����� �̸�. �ٽ� ����X
			System.out.print(e);
		}
	}

}
