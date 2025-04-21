import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SubSet2 {
  public static void subSetHelper(int start, ArrayList<Integer> list, int[] nums, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list)); 

        for(int i = start; i < nums.length; i++){
		  if(i > start && nums[i] == nums[i-1]) {
			continue;
		  }
          list.add(nums[i]);
          subSetHelper(i + 1, list, nums,ans);
          list.remove(list.size() - 1);
        }
    }

   public static List<List<Integer>> subSet(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        subSetHelper(0, new ArrayList<>(), nums, ans);
        return ans;
	}

  public static void main(String[] args) {
	  int[] nums = {4, 1, 4, 4, 4};
	  List<List<Integer>> list = subSet(nums);
	  System.out.println(list);
  }
}
