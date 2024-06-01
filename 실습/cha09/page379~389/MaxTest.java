package cha09_exercise;

class Max<T> {
	public T max(T a, T b) {
		if(a instanceof Number) {
			return ((Number)a).doubleValue() > ((Number)b).doubleValue() ? a : b;
		} else {
			return ((String)a).length() > ((String)b).length() ? a : b;
		}
	}
}

public class MaxTest {

	public static void main(String[] args) {
		Max<Number> n = new Max<>();
		System.out.println(n.max(10.0, 8.0));
		System.out.println(n.max(5, 8.0));
		
		Max<String> s = new Max<>();
		System.out.println(s.max("Hello", "Hi")); 
		System.out.println(s.max("Good", "morning"));
	}

}
