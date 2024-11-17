public class SecondLargest {
	public static int getSecondLargest(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++) {
			int currElement = arr[i];
			if(currElement > max) {
				secondMax = max;
				max = currElement;
			}
			else if(currElement > secondMax && currElement < max) {
				secondMax = currElement;
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		int[] arr = {5, 7, 8, 1, 2};
		System.out.println("Second lergest element: " + getSecondLargest(arr));
	} 
}
