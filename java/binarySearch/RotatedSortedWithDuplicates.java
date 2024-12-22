public class RotatedSortedWithDuplicates {
	public static boolean containsElement(int[] nums, int k) {
		int low = 0;
		int high = nums.length - 1;
		int mid = -1;
		while(low <= high) {
			mid = low + (high - low) / 2;
			if(nums[mid] == k) {
				return true;
			}

			if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
				low ++;
				high --;
				continue;
			}
			
			if(nums[low] < nums[mid]) {
				if(nums[low] <= k && k < nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}	
			} else {
				if(nums[mid] < k && k <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}

		return false;
	}
	public static void main(String[] args) {
		int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
		int k = 9;
		boolean result = containsElement(nums, k);
		System.out.println("result: " + result);
	}
} 
