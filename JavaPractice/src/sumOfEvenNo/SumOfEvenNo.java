package sumOfEvenNo;

public class SumOfEvenNo {

	public static void main(String[] args) {
		int [] data = {2,3,4,2,8,9,6};
		System.out.println(sumOfEvenNo(data));

	}

	private static int sumOfEvenNo(int[] data) {
		int sum = 0;
		for(int e: data) {
			if(e%2 == 0) {
				sum += e;
			}
		}
		
		return sum;
	}

}
