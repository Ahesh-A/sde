import java.util.Arrays;

public class GetFloorCeil {
	public static int getCeil(int[] nums, int target, int low, int high) {
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
	
	public static int getFloor(int[] nums, int target, int low, int high) {
		int ans = -1;

		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(nums[mid] <= target) {
				ans = mid;
				low = mid + 1;
			}else {
				high = mid - 1;
			} 
		}

		return ans;
	}

	public static int[] getCeilFloor(int[] nums, int target) {
		int ceil = getCeil(nums, target, 0, nums.length - 1);
		int floor = getFloor(nums, target, 0, nums.length - 1);

		return new int[]{ceil, floor};
	}
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 5, 6, 7, 9};
		int target = 5;
		
		int[] ans = getCeilFloor(nums, target);
		System.out.println(Arrays.toString(ans));
	}
}
