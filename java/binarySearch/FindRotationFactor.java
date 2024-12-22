public class FindRotationFactor {
	public static int findRotationFactor(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int ans = Integer.MAX_VALUE;
		int idx = -1;

		while(low <= high) {
			int mid = low + (high - low) / 2;

			if(nums[mid] <= nums[high]) {
				if(ans >= nums[mid]) {
					ans = nums[mid];
					idx = mid;
				}
				high = mid - 1;
			} else {
				if(ans >= nums[low]) {
					ans = nums[low];
					idx = low;
				}
				low = mid + 1;
			}
		}

		return idx;
	}
	public static void main(String[] args) {
		int[] nums = {4, 5, 6, 0, 1, 2, 3};
		int res = findRotationFactor(nums);
		System.out.println("result: " + res);
	}
}
