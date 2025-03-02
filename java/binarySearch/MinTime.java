/*Problem Statement: Given an array/list of length ‘N’, where the array/list represents the boards and each element of the given array/list represents the length of each board. Some ‘K’ numbers of painters are available to paint these boards. Consider that each unit of a board takes 1 unit of time to paint. You are supposed to return the area of the minimum time to get this job done of painting all the ‘N’ boards under the constraint that any painter will only paint the continuous sections of boards.

Example 1:
Input Format:
 N = 4, boards[] = {5, 5, 5, 5}, k = 2
Result:
 10
Explanation:
 We can divide the boards into 2 equal-sized partitions, so each painter gets 10 units of the board and the total time taken is 10.

Example 2:
Input Format:
 N = 4, boards[] = {10, 20, 30, 40}, k = 2
Result:
 60
Explanation:
 We can divide the first 3 boards for one painter and the last board for the second painter.
 */
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;

public class MinTime {
  public static int getCount(List<Integer> arrList, long mid) {
	int count = 1;
	long sum = 0;

	for(Integer i : arrList) {
	  if(sum + i <= mid) {
		sum += i;
	  }  else {
		sum = i;
		count ++;
	  }
	}
	return count;
  }

  public static long getMinTime(int[] arr, int k) {
	List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
	
	long low = Collections.max(arrList);
	long high = arrList.stream().mapToInt(Integer::intValue).sum();
	
	while(low <= high) {
	  long mid = low + (high - low) / 2;
	  int count = getCount(arrList, mid);
	  System.out.println(low + " " + mid + " " + high + " " + count);
	  if(count <= k) {
		high = mid - 1;
	  } else {
		low = mid + 1;
	  }
	}
	return low;
  }
  public static void test(int[] arr, int k) {
	List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

	for(long i = 20; i > 0; i--) {
	  System.out.println(getCount(arrList,i));
	}
  }
  public static void main(String[] args) {
	int[] arr = {5, 5, 5, 5};
	int k = 2;
//	test(arr, k);
	System.out.println("result: " + getMinTime(arr, k));	
  }

}
