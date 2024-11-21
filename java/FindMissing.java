public class FindMissing {
	public static int getMissingNumber(int[] arr, int n){
		int num1 = 0, num2 = 0;

		for(int i = 0; i < n - 1; i++) {
			num1 ^= arr[i];
			num2 ^= (i + 1);
		}

		return num1 ^ num2 ^ n;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 9, 7, 10, 5, 6};
		System.out.println("The missing number is: " + getMissingNumber(arr, 10));
	}
}
