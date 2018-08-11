
public class Fibonacci {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.print( a + " " + b +" ");
		for (int i = 0; i <= 12; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}
