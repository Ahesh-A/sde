import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Combination2 {
  public static void getCombinationHelper(int[] nums, int target, int start, List<Integer> list, List<List<Integer>> ans) {
	if(target == 0) {
	  ans.add(new ArrayList<>(list));
	}

	for(int i = start; i < nums.length; i++) {
	  if(i > start && nums[i] == nums[i - 1]) {
		continue;
	  }
	  if(nums[i] > target) {
		break;
	  }
	  list.add(nums[i]);
	  getCombinationHelper(nums, target - nums[i], i + 1, list, ans);
	  list.remove(list.size() - 1);
	}
  }
  public static List<List<Integer>> getCombination(int[] nums, int target) {
	Arrays.sort(nums);
	List<Integer> list = new ArrayList<>();
	List<List<Integer>> ans = new ArrayList<>();
	getCombinationHelper(nums, target, 0, list, ans);
	return ans;
  }
  public static void main(String[] args) {
	int[] nums = {10,1,2,7,6,1,5};
	int target = 8;
	List<List<Integer>> ans = getCombination(nums, target);
	System.out.println(ans);
  }
}
