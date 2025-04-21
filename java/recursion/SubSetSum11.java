import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class SubSetSum11 {
  public static void getSubSetHelper(int idx, int sum, int[] nums, Set<Integer> ans) {
	if(idx == nums.length) {
	  ans.add(sum);
	  return;
	}

	getSubSetHelper(idx + 1, sum + nums[idx], nums, ans);
	getSubSetHelper(idx + 1, sum, nums, ans);
  }
  public static List<Integer> getSubSet(int[] nums) {
	Set<Integer> ans = new HashSet<>();
	getSubSetHelper(0, 0, nums, ans);
	return new ArrayList<>(ans);
  }

  public static void main(String[] args) {
	int[] nums = {1, 2, 5};
	List<Integer> ans = getSubSet(nums);
	System.out.println(ans);
  }
}
