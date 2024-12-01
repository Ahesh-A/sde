import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class ThreeSum {
	public static List<List<Integer>> getTriplets(int[] arr) {
		Set<List<Integer>> res = new HashSet<>();
		int n = arr.length;
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			Set<Integer> temp = new HashSet<>();
			for(int j = i + 1; j < n; j++) {
				int target = -(arr[i] + arr[j]);
				if(temp.contains(target)) {
					res.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], target)));
				} else {
					temp.add(arr[j]);
				}
			}
		}
		return new ArrayList<>(res);

	}
	public static void main(String[] args) {
		int[] arr = {-1, 0, 1, 2, -1, -4};
		System.out.println(getTriplets(arr));
	}
}
