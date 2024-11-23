import java.util.Map;
import java.util.HashMap;

public class LongestSubarray {
	public static int getMaxLen(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int res = 0;
		map.put(0, -1);
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			int temp = sum - target;
			if(map.containsKey(temp)) {
				res = Integer.max(res, i - map.get(temp));
			}
			if(!map.containsKey(sum)){
				map.put(sum, i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {-2, 2, 5, -7, 3, 5, -2, 1};
		System.out.println("Result: " + getMaxLen(arr, 7));
	}
}

