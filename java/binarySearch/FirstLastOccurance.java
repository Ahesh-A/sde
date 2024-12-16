import java.util.Arrays;

public class FirstLastOccurance {
	public static int getFirst(int[] nums, int target, int low, int high) {
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

	public static int getLast(int[] nums, int target, int low, int high) {
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
	public static int[] getFirstAndLastOccurance(int[] nums, int target) {
		int first = getFirst(nums, target, 0, nums.length - 1);
		int last = getLast(nums, target, 0, nums.length - 1);

		return new int[]{first, last};
	
	}
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 4, 4, 4, 5, 6, 7, 7, 8};
		int target = 4;
		int[] ans = getFirstAndLastOccurance(nums, target);
		System.out.println(Arrays.toString(ans));
	}
}
