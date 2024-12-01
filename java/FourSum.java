import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class FourSum {
	public static List<List<Integer>> fourSum(int[] arr, int target) {
		Set<List<Integer>> res = new HashSet<>();
		int n = arr.length;
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				Set<Integer> temp = new HashSet<>();
				for(int k = j + 1; k < n; k++) {
					int residue = target - arr[i] - arr[j] - arr[k];
					if( temp.contains(residue)) {
						res.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], residue)));
					} else {
						temp.add(arr[k]);
					}
				}
			}
		}
		return new ArrayList<>(res);
	}
	public static void main(String[] args) {
		int[] arr = {-1, 2, -1, 0, 1, 0};
		System.out.println(fourSum(arr, 0));
	}
}