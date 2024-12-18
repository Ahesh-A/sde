public class FindElementInRotatedSortedArray {
	public static int findTarget(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while(low <= high) {
			int mid = low + (high - low) / 2;
			int midElem = nums[mid];

			if(midElem == target) {
				return mid;
			} else if(midElem <= nums[high]) {
				if(target <= nums[high] && target >= midElem) {
					low = mid + 1;
				}else {
					high = mid - 1;
				}
			} else {
				if(target < midElem && target >= nums[low]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {7, 8, 9, 1, 2, 3, 5};
		int res = findTarget(nums, 9);
		System.out.println(res);
	}	
}
