
public class Recursionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("factorial of" + factorial(3));
		System.out.println("factorial of" + factorialr(3));
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		return fact;
	}

	private static int factorialr(int n) {
		// TODO Auto-generated method stub
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}
}
