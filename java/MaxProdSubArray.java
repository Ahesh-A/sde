public class MaxProdSubArray {
	public static int getMaxProd(int[] nums) {
		int prefix = 1;
		int suffix = 1;

		int res = Integer.MIN_VALUE;
		int n = nums.length;

		for(int i = 0; i < n; i++) {
			prefix *= nums[i];
			suffix *= nums[n - i - 1];

			res = Integer.max(res, Integer.max(prefix, suffix));
			if(prefix == 0) {
				prefix = 1;
			}

			if(suffix == 0) {
				suffix = 1;
			}
		}

		return res;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,-3,0,-4,-5};
		int res = getMaxProd(nums);
		System.out.println(res);
	}
}
