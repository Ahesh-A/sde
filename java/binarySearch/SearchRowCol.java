/*Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row and each column are sorted in non-decreasing order.
But, the first element of a row is not necessarily greater than the last element of the previous row (if it exists).
You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.

mple 1:
Input Format:
 N = 5, M = 5, target = 14
 mat[] = 

Result:
 true
Explanation:
 Target 14 is present in the cell (3, 2)(0-based indexing) of the matrix. So, the answer is true.

 Example 2:
 Input Format:
  N = 3, M = 3, target = 12,

  mat[] = 

Result:
 false
Explanation:
 As target 12 is not present in the matrix, the answer is false.
 */

public class SearchRowCol {
  public static boolean isPresent(int[][] arr, int target) {
	int i = 0;
	int j = arr[0].length - 1;

	while(i < arr.length && j >= 0) {
	  int elem = arr[i][j];
	  if(elem == target) {
		return true;
	  } else if(elem > target) {
		j--;
	  } else {
		i++;
	  }
	}

	return false;
  }

  public static void main(String[] args) {
	int[][] arr = {
	  {1, 4, 7, 11, 15},
	  {2, 5, 8, 12, 19},
	  {3, 6, 9, 16, 22},
	  {10, 13, 14, 17, 24},
	  {18, 21, 23, 26, 30}
	};
	System.out.println("Result: " + isPresent(arr, 23));
  }
}
