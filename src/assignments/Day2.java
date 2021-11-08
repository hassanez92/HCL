package assignments;

import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args) {
	prob1();
	System.out.println("Prob 1:");

	Scanner input = new Scanner(System.in);
    System.out.print("Input a string: ");
    String str = input.nextLine();
    System.out.print("The middle character in the string: " + prob2(str)+"\n");
	System.out.println("Prob 2:");

    System.out.print("Input the string: ");
    String str1 = input.nextLine();
	System.out.println("Prob 3:");

    System.out.print("Number of  Vowels in the string: " + prob3(str1)+"\n");
    
    prob5();
	prob9();
	prob10();

	

	}

	private static void prob1() {
		// TODO Auto-generated method stub
		int n1 = 5;
		int n2 = 10;
		int n3 = 15;
		
		if(n1<=n2&&n1<=n3) {
			System.out.println(n1 + " is the smallest");
			
		}
		else if(n2<=n1&&n2<=n3) {
			System.out.println(n2 + "is the smallest");

		}
		else
		{
			System.out.println(n3 + "is the smallest");

		}
	}
	private static String prob2(String str) {
		// TODO Auto-generated method stub
        int n;
        int length;
        if (str.length() % 2 == 0)
        {
            n = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            n = str.length() / 2;
            length = 1;
        }
		return str;



		
	}
	private static int prob3(String str1) {
		// TODO Auto-generated method stub
		int count = 0;
        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i'
                    || str1.charAt(i) == 'o' || str1.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;

		
	}
	
	private static void prob4() {
		
		//Check Room class
	}
		
	private static void prob5() {
		// TODO Auto-generated method stub
		class A {
			int a = 100;

			public void display() {
				System.out.printf("a in A = %d\n", a);
			}

		}

		class B extends A {
			private int a = 123;

			public void display() {
				System.out.printf("a in B = %d\n", a);
			}

		}

		class C extends B {
			private int a = 543;

			public void display() {
				System.out.printf("a in C = %d\n", a);
			}

		}
		
	}
	
	
	
	private static void prob9() {
		// TODO Auto-generated method stub
		
	}
	private static void prob10() {
		// TODO Auto-generated method stub
		
	}
	

}
