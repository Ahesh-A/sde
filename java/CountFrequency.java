import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	public static void printFrequency(int[] arr){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr) {
			int frequency = map.getOrDefault(i, 0);
			map.put(i, frequency + 1);
		}
		
		map.forEach((k, v) -> System.out.println(k + ": " + v));
	}
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 3, 1, 3, 4, 4, 4, 5};
		printFrequency(arr);
	}
}
