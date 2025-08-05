package findBiggestNumber;

public class FindBiggestNumber {

	public static void main(String[] args) {
		System.out.println(findBiggestNumber(5,8,11));

	}
	public static int findBiggestNumber(int x, int y, int z) {
		int biggestNum = x;
		if(y > biggestNum) {
			biggestNum = y;
		}
		if(z > biggestNum) {
			biggestNum = z;
		}
		
		return biggestNum;		
	}

}
