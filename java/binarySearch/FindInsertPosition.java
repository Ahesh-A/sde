public class FindInsertPosition {
	public static int getIndex(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int ans = 0;

		while(low <= high) {
			int mid = low + (high - low) / 2;

			if(nums[mid] >= target) {
				high = mid - 1;
				ans = mid;
			} else {
				low = mid + 1;
			}
		}

		return ans;
	}
	public static void main(String[] args) {
		int [] nums = {1, 3, 4, 5, 7, 7, 8};
		int target = 6;
		int res = getIndex(nums, target);

		System.out.println("result :" + res);
	}
}
