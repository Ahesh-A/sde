import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Arrays;

public class NRani {
  public static void addSol(char[][] arr, List<List<String>> ans) {
	StringBuilder sb = new StringBuilder();
	List<String> list = new ArrayList<>();

	for(char[] cArr : arr) {
	  for(char c : cArr) {
		sb.append(c);
	  }
	  list.add(sb.toString());
	  sb.setLength(0);
	}
	ans.add(list);
  }
  
  public static boolean ifRaniAttack(int row, int col, char[][] arr) {
	int r = row;
	int c = col;
	while(c >= 0 ) {
	  if(arr[r][c] == 'Q') {
		return true;
	  }
	  c--;
	}
	
	c = col - 1;
	r = row - 1;

	while(c >= 0 && r >= 0) {
	  if(arr[r][c] == 'Q') {
		return true;
	  }
	  r--;
	  c--;
	}
	
	c = col - 1;
	r = row + 1;

	while(r < arr.length && c >= 0) {
	  if(arr[r][c] == 'Q') {
		return true;
	  }

	  r++;
	  c--;
	}

	return false;
  }

  public static void getNRaniHelper(int n, int col, char[][] arr, List<List<String>> ans) {
	if(col == n) {
	  addSol(arr, ans);
	  return;
	}
	
	for(int row = 0; row < arr.length; row++){
	  if(!ifRaniAttack(row, col, arr)) {
		arr[row][col] = 'Q';
		getNRaniHelper(n, col + 1, arr, ans);
		arr[row][col] = '.';
	  }
	}
   }
  public static List<List<String>> getNRani(int n) {
	char[][] arr = new char[n][n];
	Arrays.stream(arr).forEach(row -> Arrays.fill(row, '.'));
	List<List<String>> ans = new ArrayList<>();
	getNRaniHelper(n, 0, arr, ans);
//	test(arr, 1, 1);
	return ans;
  }
  public static void test(char[][] arr, int i, int j) {
	arr[0][0] = 'Q';
	boolean res = ifRaniAttack(i, j, arr);
	System.out.println(res);
  }
  public static void main(String[] args) {
	int n = 6;

	List<List<String>> res = getNRani(n);
	System.out.println(res);
  }
}
