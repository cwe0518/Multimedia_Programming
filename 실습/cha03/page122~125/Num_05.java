package page122;

public class Num_05 {

	public static void main(String[] args) {
		for (int a = 1; a <= 20; a++) {
            for (int b = a; b <= 20; b++) {
                for (int c = b; c <= 20; c++) {
                    if (a * a + b * b == c * c && a + b + c <= 20) {
                        System.out.printf("a: %d, b: %d, c: %d", a, b, c);
                    }
                }
            }
        }
	}
}
