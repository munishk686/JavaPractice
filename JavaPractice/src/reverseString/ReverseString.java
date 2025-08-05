package reverseString;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("Munish"));

	}
	
	public static String reverseString(String str) {
		str = str.toLowerCase();
		String newstring="";
		for(int i = str.length()-1; i >= 0; i--) {
			newstring += str.charAt(i);
		}
		return newstring;
	}

}
