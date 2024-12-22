public class FindSqrt {
	public static int getSqrt(int num) {
		int low = 1;
		int high = num / 2;

		while(low <= high) {
			int mid = low + (high - low) / 2;
			long temp = mid * mid;

			if(temp < num) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return high;
	}
	public static void main(String[] args) {
		int num = 35;
		System.out.println(getSqrt(num));
	}
}
