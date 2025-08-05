package palindrome;

public class CheckPalindrome {

	public static void main(String[] args) {
		System.out.println(ispalindrome("madam"));

	}
	public static boolean ispalindrome(String str) {
		
		int start = 0;
		int end = str.length()-1;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return  false;
			}
			start++;
			end--;
		}
		
		return true;
	}

}
