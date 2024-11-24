import java.util.Set;
import java.util.HashSet;


public class TwoSum {
	public static String  twoSum(int[] arr, int target) {
		Set<Integer> set = new HashSet<>();

		for(int i = 0; i < arr.length; i++) {
			if(set.contains(target - arr[i])){
				return "YES";
			}
			else{
				set.add(arr[i]);
			}
		}

		return "NO";
	}
	public static void main(String[] args) {
		int[] arr = {2,6,5,8,11};
		int target = 14;
		System.out.println(twoSum(arr, target));
	}
}

