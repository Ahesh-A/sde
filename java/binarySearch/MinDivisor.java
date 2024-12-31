public class MinDivisor {
	public static int getMax(int[] nums) {
		int ans = nums[0];

		for(int i : nums) {
			ans = Integer.max(ans, i);
		}

		return ans + 1;
	}
	public static boolean isDivisorWithInLimit(int[] nums, int limit, int mid) {
		int count = 0;

		for(int i : nums) {
			count += Math.ceil((double)i / (double)mid);
		}

		return count <= limit;
	}
	public static int getMinDivisor(int N, int limit, int[] nums) {
		int low = 1;
		int high = getMax(nums);

		while(low <= high) {
			int mid = low + (high - low) / 2;
			boolean withInLimit = isDivisorWithInLimit(nums, limit, mid);

			if(!withInLimit) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return low;
	}
	public static void main(String[] args) {
		int[] arr = {8, 4, 2, 3};
		int limit = 10;
		int N = 4;
		System.out.println(getMinDivisor(N, limit, arr));
	}	
}
