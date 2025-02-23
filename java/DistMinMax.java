import java.util.ArrayList;
import java.util.List;

public class DistMinMax {
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

  public static int getMin(List<Integer> list) {
	int res = Integer.MAX_VALUE;
	for(int i = 1; i < list.size(); i++) {
	  res = Integer.min(list.get(i) - list.get(i - 1), res);
	}

	return res;
  }
  public static int getMinMax(List<List<Integer>> list) {
	int res = Integer.MIN_VALUE;
	for(List<Integer> elem : list) {
	  res = Integer.max(res, getMin(elem));
	}
	return res;
  }
  public static void main(String[] args) {
	int[] arr = {0, 3, 4, 7, 10, 9};
	int k = 4;
	List<List<Integer>> list = getAllCombination(arr, k);

	System.out.print("res: " + getMinMax(list));
  }
}
