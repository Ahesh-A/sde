public class CountDuplicates {
	public static int getLeft(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int ans = -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;

			if(nums[mid] >= target) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return ans;
	}
	public static int getRight(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int ans = -1;

		while(low <= high) {
			int mid = low + (high - low) / 2;

			if(nums[mid] <= target) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return ans;
	}
	public static int getCount(int[] nums, int target) {
		int left = getLeft(nums, target);
		int right = getRight(nums, target);
		System.out.println("right: " +  right);
		System.out.println("left: " + left);
		int n = nums.length;
		if( left == -1 || right == -1 || left == n || right == n || left == nums[left] != target || nums[right] != target) {
			return 0;
		}

		return right - left + 1;
	}
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 4, 4, 4, 7, 8, 8};
		int target = 5;
		int res = getCount(nums, target);
		System.out.println(res);
	}
}
