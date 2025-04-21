import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SubSetSum1 {
  public static int getLen(int[] nums) {
	int sum = 0;
	for(int i : nums) {
	  sum += i;
	}

	return sum;
  }

  public static List<Integer> getSubSetSum(int[] nums) {
	int len = getLen(nums);
	boolean[] prev = new boolean[len + 1];
	boolean[] curr = new boolean[len + 1];
	prev[0] = true;
	List<Integer> sol = new ArrayList<Integer>();

	for(int i = 0; i < nums.length; i++) {
	  for(int j = 0; j < len + 1; j++) {
		if(nums[i] <= j) {
		  curr[j] = prev[j] || prev[j - nums[i]];
		} else {
		  curr[j] = prev[j];
		}
	  }

	  boolean[] temp = prev;
	  prev = curr;
	  curr = temp;
	  System.out.println(Arrays.toString(prev));
	}
  
	for(int i = 0; i < len + 1; i++) {
	  if(prev[i]) {
		sol.add(i);
	  }
	}
	
	return sol;
  }
  public static void main(String[] args) {
	int[] nums = {1, 2, 5};
	List<Integer> ans = getSubSetSum(nums);
	System.out.println(ans);
  }
}
