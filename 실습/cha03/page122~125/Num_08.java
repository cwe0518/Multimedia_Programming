package page122;

public class Num_08 {

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}
	
	static int factorial(int n) {
		
		int r = 1;
		
		switch(n) {
		case 0 -> r = 0;
		case 1 -> r = 1;
		default -> {
			while(n > 0) {
				r *= n;
				n--;
			}
		  }
		}
		
		return r;
	}

}
