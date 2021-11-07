import java.util.Stack;

public class prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// given a string with a bunch open and closed braces'{}'
		// write a function which returns true if all open braces match all the closed
		// braces
		// returns a false if they dont match
		/*
		 * {{{}}} = true
		 * 
		 * {{{}}}} = false
		 * 
		 * }}}{{{ = false
		 * 
		 */

		System.out.println(checkBraces(("{{{}}}")));
		System.out.println(checkBraces(("{{{}}}}")));
		System.out.println(checkBraces(("}}}{{{")));
		System.out.println(checkBraces(("{}}}{{{}")));
		System.out.println("Stack" + checkBracesWithStack(("{{{}}}")));
		System.out.println("Stack" + checkBracesWithStack(("{{{}}}}")));
		System.out.println("Stack" + checkBracesWithStack(("}}}{{{")));
		System.out.println("Stack" + checkBracesWithStack(("{}}}{{{}")));
	}

	private static boolean checkBraces(String input) {
		int c1 = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '{')
				c1++;
			if (input.charAt(i) == '}')
				c1--;
			if (c1 < 0)
				return false;
		}
		if (c1 == 0)
			return true;
		else
			return false;
	}

	private static boolean checkBracesWithStack(String input) {
		
		Stack<Character>st = new Stack<Character>();
		for (char x : input.toCharArray()) {
			if (x == '{') {
				st.push(x);
			}
			if (x == '}') {
				try {
					st.pop();

				} catch (Exception e) {
					return false;
				}
				/*
				 * if(st.empty()) { return false; }
				 */
			}
		}

			if (st.empty()) {
				return true;
			} else {
				return false;
			}

			/*
			 * for(int i=0;i<input.length();i++) { if(input.charAt(i)=='{') c1++;
			 * if(input.charAt(i)=='}') c1--; if(c1<0) return false; } if(c1==0) return
			 * true; else return false; }
			 */
		}
	}

