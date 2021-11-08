package assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Day3 {

	public static void main(String[] args) {
		System.out.println("Prob 1:");
		prob1();
		System.out.println("Prob 2:");
		prob2();
		System.out.println("Prob 4:");
		Random rd = new Random();
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			int x = rd.nextInt(25);
			nums[i] = x;
			System.out.println(x);
		}
		System.out.println(5 + " is in the list: " + prob4(5, nums));
		System.out.println("Prob 5:");

		String test5 = "HelloWorld";
		System.out.println(prob5(1, 1, test5));
		
		System.out.println("Prob 6:");

		String madam = "MadaM";
		System.out.println(prob6("madam"));
		
		System.out.println("Prob 7:");

		String full = "The quick brown fox jumped over the lazy dogs back";
		String half = "This is my test sentence";
		prob7(full);

	}

	private static void prob1() {
		// TODO Auto-generated method stub

		String name = "HAssAn";
		System.out.println(name);
		System.out.println(name.toLowerCase());

	}

	private static void prob2() {
		// TODO Auto-generated method stub
		String name = "abbccdddddee";
		String replace = name.replace("d", "h");
		System.out.println(name);
		System.out.println(replace);

	}


	
		// TODO Auto-generated method stub
		public static boolean prob4(int searchD, int[] nums) {
			for (int i : nums) {
				if (i == searchD) {
					return true;
				}
			}
			return false;
		}

	

	
		private static String prob5(int first, int last, String test5) {
			String result = "";
			char[] chr = test5.toCharArray();
			if (first > last) {
				int temp = first;
				first = last;
				last = temp;
			} else if (first == last) {
				last++;
			}
			if (last <= test5.length() - 1 || first > 0) {
				for (int i = first; i < last; i++) {
					result += chr[i];
				}
			} else {
				return "Index(es) out of bounds for string!!!!";
			}
			return result;
		}

	

		// TODO Auto-generated method stub
		public static boolean prob6(String check) {
			char[] ch = check.toLowerCase().toCharArray();
			String revCheck = "";
			for (int i = check.length() - 1; i >= 0; i--) {
				revCheck += ch[i];
			}
			if (revCheck.equals(check.toLowerCase())) {
				return true;
			}
			return false;
		}

	

	
		// TODO Auto-generated method stub
		private static void prob7(String full) {
			String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
					"s", "t", "u", "v", "w", "x", "y", "z" };
			char[] check = full.toLowerCase().toCharArray();
			Arrays.sort(check);
			Set<String> checkD = new HashSet<>();
			String result = "Pangram";
			for (int i = 0; i < check.length; i++) {
				Character temp = check[i];
				checkD.add(temp.toString());
			}
			for (String s : alpha) {
				if (!checkD.contains(s)) {
					result = "Not a Pangram";
				}
			}
			System.out.println(result);
		

	}
}
