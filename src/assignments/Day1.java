package assignments;

public class Day1 {
	public static void main(String[] args) {

		int a = (-5 + 8 * 6);
		int b = ((55 + 9) % 9);
		int c = (20 + -3 * 5 / 8);
		int d = 5 + 15 / 3 * 2 - 8 % 3;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("Prob 2:");
		problem2();
		System.out.println("prob 3: " + prob3(a, b, c));
		System.out.println(prob4());
	}// finsihed

	

private static char[] prob4() {
		// TODO Auto-generated method stub
		return null;
	}



//Problem 2.	
	public static void problem2() {
		int a1 = 20 + 4;
		int b1 = 20 * 4;
		int c1 = 20 - 4;
		int d1 = 20 / 4;
		int e1 = 20 % 4;

		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
	}


//Problem 3
public static int prob3(int a, int b, int c) {
	return ((a + b + c) / 3);
}




}
