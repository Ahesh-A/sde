import java.util.Map;
import java.util.HashMap;

public class SubArrSumEqK {
	public static int getSubArrayWithSumK(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int count = 0;
		map.put(0, 1);
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			int remaining = sum - target;
			count += map.getOrDefault(remaining, 0);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4};
		System.out.println(getSubArrayWithSumK(arr, 6));
	}
}
