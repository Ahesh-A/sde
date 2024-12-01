import java.util.Map;
import java.util.HashMap;

public class LongSumZero {
	public static int getLengthOfLongestSubArrayWithSumZero(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>(); 
		map.put(-1, 0);
		int sum = 0;
		int res = 0;

		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if(map.containsKey(sum)) {
				res = Integer.max(res, i - map.get(sum));		
			} else {
				map.put(sum, i);
			}
		}

		return res;
	}
	public static void main(String[] args) {
		int[] nums = {9, -3, 3, -1, 6, -5};
		System.out.println(getLengthOfLongestSubArrayWithSumZero(nums));
	}
}
