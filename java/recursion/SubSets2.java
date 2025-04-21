import java.util.List;
import java.util.ArrayList;

public class SubSets2 {
  public static void getSubSetsHelper(int idx, int[] nums, List<Integer> list, List<List<Integer>> ans) {
	if(idx == nums.length) {
	  if(!ans.contains(list)){
		ans.add(new ArrayList<>(list));
	  }
	  return;
	}

	int elem = nums[idx];
	list.add(elem);
	getSubSetsHelper(idx + 1, nums, list, ans);
	list.remove(list.size() - 1);
	getSubSetsHelper(idx + 1, nums, list, ans);
  }
  public static List<List<Integer>> getSubSets(int[] nums) {
	List<Integer> list = new ArrayList<>();
	List<List<Integer>> ans = new ArrayList<>();

	getSubSetsHelper(0, nums, list, ans);
	return ans;
  }
  public static void main(String[] args) {
	int[] nums = {1, 2, 2};
	List<List<Integer>> ans = getSubSets(nums);
	System.out.println(ans);
  }
}
