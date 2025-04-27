import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class Rat {
  public static void getPathsHelper(int i, int j, int[][] nums, List<String> ans, StringBuilder sb){
	int row = nums.length;
	int col = nums[0].length;

	if(i == row - 1 && j == col - 1) {
	  ans.add(sb.toString());
	  return;
	}
	
	if(i + 1 < row && nums[i + 1][j] == 1) {
	  nums[i][j] = 0;
	  getPathsHelper(i + 1, j, nums, ans, sb.append('D'));
	  sb.deleteCharAt(sb.length() - 1);
	  nums[i][j] = 1;
	}

	if(j - 1 >= 0 && nums[i][j - 1] == 1) {
	  nums[i][j] = 0;
	  getPathsHelper(i, j - 1, nums , ans , sb.append('L'));
	  sb.deleteCharAt(sb.length() - 1);
	  nums[i][j] = 1;
	}

	if(i - 1 >= 0 && nums[i - 1][j] == 1) {
	  nums[i][j] = 0;
	  getPathsHelper(i - 1, j, nums, ans, sb.append('U'));
	  sb.deleteCharAt(sb.length() - 1);
	  nums[i][j] = 1;
	}

	if(j + 1 < col && nums[i][j + 1] == 1) {
	  nums[i][j] = 0;
	  getPathsHelper(i, j + 1, nums, ans, sb.append('R'));
	  sb.deleteCharAt(sb.length() - 1);
	  nums[i][j] = 1;
	}

  }
  public static List<String> getPaths(int[][] nums) {
	List<String> ans = new ArrayList<>();
	
	getPathsHelper(0, 0, nums, ans, new StringBuilder());
	return ans;
  }
  public static void main(String[] args) {
	int[][] nums = {
	  {1, 0, 0, 0},
	  {1, 1, 0, 0},
	  {1, 1, 0, 0},
	  {0, 1, 1, 1}
	};

	List<String> ans = getPaths(nums);
	System.out.println(ans);
  }
}
