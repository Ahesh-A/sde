public class SingleElement {
	public static int findElement(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int mid = -1;

		while(low < high) {
			mid = low + (high - low) / 2;
			if(mid % 2 == 0) {
				if(mid + 1 <= high && nums[mid] == nums[mid + 1]) {
					low = mid + 2;
				} else {
					high = mid;
				}
			} else {
				if(mid - 1 >= low && nums[mid] == nums[mid - 1]) {
					low = mid + 1;
				} else {
					high = mid;
				}
			}
		}

		return low;
	}

	public static void main(String[] args) {
		int[] nums = {1};
		int res = findElement(nums);
		System.out.println(res);
	}
}
