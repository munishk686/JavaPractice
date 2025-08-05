package isPrimeNo;

public class IsPrimeNo {

	public static void main(String[] args) {
		System.out.println(isPrime(10));
	}
	private static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i = 2; i <= n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
