public class FindMinRSA {
	public static int findMin(int[] nums) {
		int ans = Integer.MAX_VALUE;
		int low = 0;
		int high = nums.length - 1;

		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(nums[mid] < nums[high]) {
				ans = Integer.min(ans, nums[mid]);
				high = mid - 1;
			} else {
				ans = Integer.min(ans, nums[low]);
				low = mid + 1;
			}
		}

		return ans;
	}
	public static void main(String[] agrs) {
		int[] nums = {10, 13, 15, 7, 9};
		int res = findMin(nums);
		System.out.println(res);
	}
}
