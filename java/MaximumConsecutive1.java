public class MaximumConsecutive1 {
	public static int findMaxConsecutive1 (int[] arr) {
		int max = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				count ++;
			} else {
				max = Integer.max(max, count);
				count = 0;
			}
		}
		max = Integer.max(max, count);
		
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1};
		System.out.println("Max consecutive ones: " + findMaxConsecutive1(arr));
	}
}
