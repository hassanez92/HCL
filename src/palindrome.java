
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a function that takes a String and returns a boolean true if it is a palindrome,
		//false if its not
		
		System.out.println(palindrome("madam"));//true
		//System.out.println(palindrome("CaT"));//false
		
		
	}

	private static boolean palindrome(String args) {
		String temp = "";
		int length = args.length();
		
		for(int i = length-1; i>=0; i--) {
			
			temp = temp + args.charAt(i);
			
		}
		if(args.equals(temp)) {
			return true;
		}
		return false;
	}
	
}
