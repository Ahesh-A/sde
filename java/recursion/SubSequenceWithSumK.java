import java.util.List;
import java.util.ArrayList;

public class SubSequenceWithSumK {
  public static void subSequenceWithSumKHelper(int k, int sum, int idx, int[] nums, List<List<Integer>> ans, List<Integer> list) {
	if(sum == k) {
	  ans.add(new ArrayList<>(list));
	  return;
	}
	if(sum > k || idx == nums.length) {
	  return ;
	}
	System.out.println(sum);
	int elem = nums[idx];
	list.add(elem);
	subSequenceWithSumKHelper(k, sum + elem, idx + 1, nums, ans, list);
	list.remove(list.size() - 1);
	subSequenceWithSumKHelper(k, sum, idx + 1, nums, ans, list);
  }	
  public static List<List<Integer>> getSubSequenceWithSumK(int[] nums, int k) {
	List<List<Integer>> ans = new ArrayList<>();
	subSequenceWithSumKHelper(k, 0, 0, nums, ans, new ArrayList<>());
	return ans;
  }
	public static void main(String[] args) {
	int[] nums = {4, 9, 2, 5, 1};
	int k = 7;
	List<List<Integer>> ans = getSubSequenceWithSumK(nums, k);
	System.out.println(ans);
  }
}
