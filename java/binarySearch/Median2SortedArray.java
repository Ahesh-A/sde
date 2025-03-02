/* Problem Statement: Given two sorted arrays arr1 and arr2 of size m and n respectively, return the median of the two sorted arrays. The median is defined as the middle value of a sorted list of numbers. In case the length of the list is even, the median is the average of the two middle elements.

Examples
Example 1:
Input Format:
 n1 = 3, arr1[] = {2,4,6}, n2 = 3, arr2[] = {1,3,5}
Result:
 3.5
Explanation:
 The array after merging 'a' and 'b' will be { 1, 2, 3, 4, 5, 6 }. As the length of the merged list is even, the median is the average of the two middle elements. Here two medians are 3 and 4. So the median will be the average of 3 and 4, which is 3.5.

Example 2:
Input Format:
 n1 = 3, arr1[] = {2,4,6}, n2 = 2, arr2[] = {1,3}
Result:
 3
*/
import java.lang.Math;

public class Median2SortedArray {
  public static double median(int[] a, int[] b) {
	int lenA = a.length;
	int lenB = b.length;

	if(lenA > lenB) {
	  return median(b, a);
	}

	int n = (lenA + lenB);
	int left = (n + 1) / 2;
	
	int low = 0;
	int high = lenA;

	while(low <= high) {
	  int mid1 = (low + high) / 2;
	  int mid2 = left - mid1;

	  int l1 = mid1 > 0 ? a[mid1 - 1] : Integer.MIN_VALUE;
	  int l2 = mid2 > 0 ? b[mid2 - 1] : Integer.MIN_VALUE;
	  int r1 = mid1 < lenA ? a[mid1] : Integer.MAX_VALUE;
	  int r2 = mid2 < lenB ? b[mid2] : Integer.MAX_VALUE;

	  if(l2 <= r1 && l1 <= r2) {
		System.out.println("l1" + l1 + "l2:" + l2 + "r1:" + r1+ "r2:" + r2);
		if(n % 2 != 0) {
		  return (double)Math.max(l1, l2);
		} else {
		  return (double) ((Math.max(l1, l2) + Math.min(r1, r2)) / 2.0);
		}
	  } else if(l1 > r2) {
		high = mid1 - 1;
	  } else {
		low = mid1 + 1;
	  }
	}

	return 0;
  }
  public static void main(String[] args) {
	int[] a = {1, 2, 3};
    int[] b = {4, 6};
	System.out.println(median(a, b));
  }
}
