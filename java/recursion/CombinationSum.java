import java.util.List;
import java.util.ArrayList;

public class CombinationSum {
  public static void getCombinationHelper(int idx, int target, int[] arr, List<Integer> list, List<List<Integer>> ans) {
	if(target == 0) {
	  ans.add(new ArrayList<>(list));
	  return;
	}

	if(target < 0 || idx >= arr.length) {
	  return;
	}

	int elem = arr[idx];
	list.add(elem);
	getCombinationHelper(idx, target - elem, arr, list, ans);
	list.remove(list.size() - 1);
	getCombinationHelper(idx + 1, target, arr, list, ans);
  }

  public static List<List<Integer>> getCombination(int[] nums, int target) {
	List<Integer> list = new ArrayList<>();
	List<List<Integer>> ans = new ArrayList<>();
	getCombinationHelper(0, target, nums, list, ans);
	return ans;
  }

  public static void main(String[] args) {
	int[] nums = {2, 3, 6, 7};
	int target = 7;

	List<List<Integer>> ans = getCombination(nums, target);
	System.out.println(ans);
  }
}
