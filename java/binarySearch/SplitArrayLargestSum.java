import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SplitArrayLargestSum {
  public static int splitCount(List<Integer> arrList, int k, int mid) {
	long sum = 0;
	int count = 1;

	for(Integer i : arrList) {
	  if(sum + i <= mid) {
		sum += i;
	  } else {
		count ++;
		sum = i;
	  }
	}

	return count;
  }
  public static int getMinOfMaxSubArray(int[] arr, int k) {
	if(arr.length < k) {
	  return -1;
	}
	List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

	int low = Collections.max(arrList);
	int high = arrList.stream().mapToInt(Integer::intValue).sum();

	while(low <= high) {
	  int mid = low + (high - low) / 2;
	  int splitCount = splitCount(arrList, k, mid);
	  if(splitCount <= k) {
		high = mid - 1;
	  } else {
		low = mid + 1;
	  }
	}

	return low;
  }
  public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	int k = 3;
	
	System.out.println(getMinOfMaxSubArray(arr, k));
  }
}
