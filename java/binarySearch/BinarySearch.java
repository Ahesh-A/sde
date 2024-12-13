public class BinarySearch {
	public static int findNumber(int[] nums, int start, int end, int target) {
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < target) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 7, 9};
		System.out.println(findNumber(nums, 0, nums.length - 1, 10));
	}
}
