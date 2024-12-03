import java.util.Map;
import java.util.HashMap;

public class SubArrayWithXorK {
	public static int getSubArrayWithXorK(int[] arr, int k) {
		int xor = 0;
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		for(int i : arr) {
			xor ^= i;
			if(map.containsKey(xor ^ k))  {
				count += map.get(xor ^ k);
			}
			map.put(xor, map.getOrDefault(xor, 0) + 1);
			
		}

		return count;
		
}
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9};
		int k = 5;
		System.out.println(getSubArrayWithXorK(arr, k));
	}
}

