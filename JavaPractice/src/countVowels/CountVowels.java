package countVowels;

public class CountVowels {

	public static void main(String[] args) {
		System.out.println(countVowels("Munishkumar"));

	}

	private static int countVowels(String str) {
		int sum = 0;
		str = str.toLowerCase();
		for(char s: str.toCharArray()) {
			if("aeiou".indexOf(s) != -1) {
				sum++;
			}
		}
		return sum;
	}

}
