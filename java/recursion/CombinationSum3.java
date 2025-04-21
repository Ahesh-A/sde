import java.util.List;
import java.util.ArrayList;

public class CombinationSum3 {
  public static void getCombinationHelper(int idx, int k, int n, List<Integer> list, List<List<Integer>> ans) {
	if(list.size() == k && n == 0) {
	  ans.add(new ArrayList<>(list));
	}
	
	for(int i = idx; i <= 9; i++) {
	  if(i > n) {
		break;
	  }
	  list.add(i);
	  getCombinationHelper(i + 1, k, n - i, list, ans);
	  list.remove(list.size() - 1);
	}

  }
  public static List<List<Integer>> getCombinations(int k, int n) {
	List<List<Integer>> ans = new ArrayList<>();
	List<Integer> list = new ArrayList<>();
	getCombinationHelper(1, k, n, list, ans);
	return ans;
  }
  public static void main(String[] args) {
	int k = 3;
	int target = 9;

	List<List<Integer>> ans = getCombinations(k, target);
	System.out.println(ans);
  }
}
