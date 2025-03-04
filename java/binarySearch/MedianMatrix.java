/*roblem Statement: Given a row-wise sorted matrix of size MXN, where M is no. of rows and N is no. of columns, find the median in the given matrix.

Note: MXN is odd.
Example 1:
Input Format:M = 3, N = 3, matrix[][] =

                    1 4 9 
		return 
                    2 5 6
                    3 7 8
                    
Result: 5
Explanation:  If we find the linear sorted array, the array becomes 1 2 3 4 5 6 7 8 9. So, median = 5
Example 2:
Input Format:M = 3, N = 3, matrix[][] =

                    1 3 8 
                    2 3 4
                    1 2 5
                    
Result: 3
Explanation:  If we find the linear sorted array, the array becomes 1 1 2 2 3 3 4 5 7 8. So, median = 3
*/

public class MedianMatrix {
  public static int[] getLowerUpperBound(int[][] arr) {
	int row = arr.length;
	int col = arr[0].length;
	int lower = arr[0][0];
	int upper = arr[0][col - 1];
	for(int i = 1; i < arr.length;i++) {
	  if(arr[i][0] < lower) {
		lower = arr[i][0];
	  }
	  if(arr[i][col - 1] > upper) {
		upper = arr[i][col - 1];
	  }
	}
	return new int[] {lower, upper};
  }
  public static int getSmallEqualOneD(int[] arr, int k) {
	int low = 0;
	int high = arr.length - 1;

	while(low <= high) {
	  int mid = low + (high - low) / 2;
	  int elem = arr[mid];

	  if(elem <= k) {
		low = mid + 1;
	  } else {
		high = mid - 1;
	  }
	}

	return high + 1;
  }
  public static int getSmallEqual(int[][] arr, int mid) {
	int count = 0;

	for(int[] i : arr) {
	  count += getSmallEqualOneD(i, mid);
	}

	return count;
  }
  public static int getMedian(int[][] arr) {
	int[] bounds = getLowerUpperBound(arr);
	int low = bounds[0];
	int high = bounds[1];
	int median = (arr.length * arr[0].length) / 2;

	while(low <= high) {
	  int mid = low + (high - low) / 2;
	  int smallEqual = getSmallEqual(arr, mid);
	  
	  System.out.println(mid + " " + smallEqual);
	  if(smallEqual <= median) {
		low = mid + 1; 
	  } else {
		high = mid - 1;
	  }
	}

	return low;
  }
  public static void main(String[] args) {
	int[][] arr = {
	  {1, 4, 9},
	  {2, 5, 6},
	  {3, 7, 8}
	};

	System.out.println("Result: " + getMedian(arr));
  }
}
//1, 2, 3, 4, 5, 6, 7, 8, 9
