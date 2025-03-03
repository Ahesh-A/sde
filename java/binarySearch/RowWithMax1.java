/*You have been given a non-empty grid ‘mat’ with 'n' rows and 'm' columns consisting of only 0s and 1s. All the rows are sorted in ascending order.
Your task is to find the index of the row with the maximum number of ones.
Note: If two rows have the same number of ones, consider the one with a smaller index. If there's no row with at least 1 zero, return -1.
Example 1:
Input Format:
 n = 3, m = 3, 
mat[] = 
1 1 1
0 0 1
0 0 0
Result:
 0
Explanation:
 The row with the maximum number of ones is 0 (0 - indexed).

Example 2:
Input Format:
 n = 2, m = 2 , 
mat[] = 
0 0
0 0
Result:
 -1
Explanation:
  The matrix does not contain any 1. So, -1 is the answer.
*/

public class RowWithMax1 {
  public static int getCountOne(int[] arr) {
	int n = arr.length;
	int low = 0;
	int high = n - 1;
	
	while(low <= high) {
	  int mid = low + (high - low) / 2;
	  if(arr[mid] == 1) {
		high = mid - 1;
	  } else {
		low = mid + 1;
	  }
	}
	
	return n - low;
  }
  public static void main(String[] args) {
	int[][] arr = {
	  {0, 0, 0},
	  {0, 0, 1},
	  {0, 0, 0}
	};
	int max = 0;
	int res = -1;
	for(int i = 0; i < arr.length; i++) {

	  int oneCount = getCountOne(arr[i]);
	  if(max < oneCount) {
		max = oneCount;
		res = i;
	  }
	}
	System.out.println("Res: " + res);
  }
}
