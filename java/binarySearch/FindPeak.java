public class FindPeak {
	public static int findPeak(int[] nums) {
		if(nums.length == 1) {
			return 0;
		} 

		if(nums.length == 2) {
			if(nums[0] < nums[1]) {
				return 1;
			} else {
				return 0;
			}
		}

		int low = 0;
		int high = nums.length - 1;
		int mid = -1;
		while(low < high) {
			mid = low + (high - low) / 2;

			if(nums[mid] < nums[mid + 1]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;

	}
	public static void main(String[] args) {
		int[] nums = {5, 4, 3, 2, 1};
		int res = findPeak(nums);
		System.out.println(res);
	}
}
