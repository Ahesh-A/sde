import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class MinPages {
  public static boolean couldFit(List<Integer> pages, long estimatedRes, int students) {
	int count = 1;
	long pageCount = 0;

	for(Integer i : pages) {
	  if(pageCount +  i > estimatedRes) {
		count ++;
		pageCount = i;
	  } else {
		pageCount += i;
	  }
	}

	return count <= students;
  }
  public static long findMinPages(int m, int[] arr) {
	if(m > arr.length ) {
	  return -1;
	}

	List<Integer> arrList =  Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

	long min = Collections.max(arrList);
	long max = arrList.stream().mapToInt(Integer::intValue).sum();

	while(min <=  max) {
	  long pages = min + (max - min) / 2;
	  if(couldFit(arrList, pages, m)) {
		max = pages - 1;
	  } else {
		min = pages + 1;
	  }
	}
	
	return min;
  }
  public static void main(String[] args) {
	int n = 4;
	int m = 2;
	int[] arr = {12, 34, 67, 90};
	
	System.out.print(findMinPages(m , arr));
  }
}
