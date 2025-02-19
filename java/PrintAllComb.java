import java.util.List;
import java.util.ArrayList;

public class PrintAllComb {
  public static void getAllCombinationHelper(int[] arr, int k, int i, List<List<Integer>> ans, List<Integer> list) {
	if(i == arr.length) {
	  if(list.size() == k) {
		ans.add(new ArrayList<>(list));	
	  }
	  return;
	}
	list.add(arr[i]);
	getAllCombinationHelper(arr, k, i + 1, ans, list);
	list.remove(list.size() - 1);
	getAllCombinationHelper(arr, k, i + 1, ans, list);
	
  }
  public static List<List<Integer>> getAllCombination(int[] arr, int k) {
	List<List<Integer>> ans = new ArrayList<>();
	getAllCombinationHelper(arr, k, 0, ans, new ArrayList<>());

	return ans;
  }
  public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5, 6};
	int k = 4;

	System.out.println(getAllCombination(arr, k));
  }
}
