public class LowerBound {
	public static int getLowerBound(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return right;

	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 5, 7, 9};
		int target = 0;
		System.out.println(getLowerBound(nums, target));
	}	
}
