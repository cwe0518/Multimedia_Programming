package cha05_exercises;

public class CompareArray {

	public static void main(String[] args) {
		int[] a = {3, 2, 4, 1, 5};
		int[] b = {3, 2, 4, 1};
		int[] c = {3, 2, 4, 1, 5};
		int[] d = {2, 7, 1, 8, 2};
		
		System.out.print(compareArr(a, c));
	}
	
	public static boolean compareArr(int[] x, int[] y) {
		boolean result = true;
		
		if(x.length != y.length) {
			result = false;
			return result;
		}
			
		for(int i = 0; i < x.length; i++) {
			if(result == false)
				break;
		
			result = x[i] == y[i] ? true : false;
		}
		
		return result;
	}

}
