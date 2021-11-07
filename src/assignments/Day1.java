package assignments;

import java.util.*;

public class Day1 { 
	public static void main(String[] args) {

		int a = (-5 + 8 * 6);
		int b = ((55 + 9) % 9);
		int c = (20 + -3 * 5 / 8);
		int d = 5 + 15 / 3 * 2 - 8 % 3;

		System.out.println("Prob 1:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("Prob 2:");
		problem2();
		System.out.println("prob 3: " + prob3(a, b, c));
		System.out.println("prob 4:");
		prob4();
		System.out.println("prob 5: ");
		prob5();
		System.out.println("prob 6:");
		prob6();
		System.out.println("prob 7: ");
		prob7(15);
		System.out.println("prob 8: ");
		prob8();
		System.out.println("prob 9: ");
		prob9();
	}// finsihed

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

//Prob 4
	private static void prob4() {

		int a = 20;
		int b = 5;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

	}

	private static void prob5() {
		int i = 0;
		int p = 0;
		int prime = 0;
		int n = 3;
		p = n / 2;

		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= p; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					prime = 1;
					break;
				}
			}
			if (prime == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}

	private static void prob6() {
		int chr = ' ';
		int chr2 = 'A';
		int chr3 = 'B';
		System.out.println(chr + " " + chr2 + " " + chr3);
	}

	private static void prob7(int n) {
		for (int i = 1; i <= n; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}

	}

	private static void prob8() {
		int n = 84882;
		int n3 = UserMainCode1.checkSum(n);

		if (n3 == 1) {
			System.out.println("odd:");
		} else {
			System.out.println("even");
		}
	}

	private static void prob9() {
		int sum = 56895;

		int n3 = UserMainCode.sumOfSquaresOfEvenDigits(sum);

		System.out.println(n3);

	}

}

class UserMainCode1 {
	public static int checkSum(int n) {
		int n1;
		int n2 = 0;
		int n3;
		while (n != 0) {
			n1 = n % 10;
			if (n1 % 2 != 0) {
				n2 += n1;
			}
			n /= 10;
		}
		if (n % 2 == 0) {
			n3 = -1;
		} else {
			n3 = 1;

		}
		return n3;

	}

}
