/*
 * Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row are sorted in non-decreasing order. Moreover, the first element of a row is greater than the last element of the previous row (if it exists). You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.
 *Example 1:
Input Format:
 N = 3, M = 4, target = 8,
mat[] = 
1 2 3 4
5 6 7 8 
9 10 11 12
Result:
 true
Explanation:
 The ‘target’  = 8 exists in the 'mat' at index (1, 3).

Example 2:
Input Format:
 N = 3, M = 3, target = 78,
mat[] = 
1 2 4
6 7 8 
9 10 34
Result:
 false
Explanation:
 The ‘target' = 78 does not exist in the 'mat'. Therefore in the output, we see 'false'.
 */
import java.util.Arrays;

public class Search2D {
  public static int findRow(int[][] arr, int k) {
	int n = arr.length;
	int low = 0;
	int high = n;

	while(low <= high) {
	  int mid = low + ( high - low) / 2;
	  int first = arr[mid][0];
	  int last =  arr[mid][arr[mid].length - 1]; 
	  if( first <= k && k <= last){
		return mid;
	  } else if(k < first) {
		high = mid - 1;
	  } else {
		low = mid + 1;
	  }
	}

	return - 1;
  }
  public static int[] findElement(int arr[][], int k) {
	int rowIdx = findRow(arr, k);
	if(rowIdx == -1) {
	  return new int[] {-1, -1};
	}
	int low = 0;
	int high = arr[rowIdx].length - 1;


	int[] oneDarr = arr[rowIdx];

	while(low <= high) {
	  int mid = low + (high - low) / 2;
	  int elem = oneDarr[mid];
	  
	  if(elem == k) {
		return new int[]{rowIdx, mid};
	  } else if(elem < k) {
		low = mid + 1;
	  }
	}
	return new int[] {-1, -1};
  }

  public static void main(String[] args) {
	int[][] arr = {
	  {1, 2, 3, 4,},
	  {5, 6, 7, 8},
	  {9, 10, 11, 12}
	};

	System.out.println("Result: " + Arrays.toString(findElement(arr, 0)));
  }
}
