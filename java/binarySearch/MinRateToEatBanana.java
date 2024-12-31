public class MinRateToEatBanana{
	public static int getMax(int[] nums) {
		int max = nums[0];
		for(int i : nums) {
			max = Integer.max(max, i);
		}

		return max;
	}
	public static int getHours(int[] pile, int n){
		int ans = 0;
		for(int i : pile) {
			ans += Math.ceil((double)i/(double)n);
		}

		return ans;
	}
	public static int getMinRate(int[] pile, int h) {
		int low = 1;
		int high = getMax(pile);

		while(low <= high) {
			int mid = low + (high - low) / 2;
			int hours = getHours(pile, mid);

			if(hours > h) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		int[] pile = {7, 15, 6, 3};
		int h = 8;
		
		int minRate = getMinRate(pile, h);
		System.out.println(minRate);
	}
}
